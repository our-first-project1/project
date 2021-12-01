package com.pang.buyticket.controller;

import com.alibaba.fastjson.JSONObject;
import com.pang.buyticket.entity.User;
import com.pang.buyticket.md5.MD5utils;
import com.pang.buyticket.service.UserService;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@WebServlet(name = "UserServlet",urlPatterns = "/user")
public class UserServlet extends BasicServlet {

    private UserService service = new UserService();
    MD5utils md5=new MD5utils();

    public void register(final HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap();
        User user = new User();

        ConvertUtils.register(new Converter() {
            @Override
            public Object convert(Class clazz, Object o) {
                Date birthday = null;
                if(o instanceof String){
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        birthday = sdf.parse(request.getParameter("birthday"));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                return birthday;
            }
        }, Date.class);


        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        /*try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            user.setBirthday(sdf.parse(request.getParameter("birthday")));
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

        boolean flag = service.register(user);
        if (flag){
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            request.getRequestDispatcher(request.getContextPath()+"/index.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }
    }

    public void login(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{

        String telephone = request.getParameter("telephone");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        //免登录
        String free = request.getParameter("free");

        if(remember==null){
            password = md5.string2MD5(password);
        }

        User user = service.login(telephone, password);
        if (user!=null){
            HttpSession session = request.getSession();

            if(free!=null && free.trim().equals("free")){
                //创建Cookie
                Cookie telephoneCookie=new Cookie("telephone",telephone);
                Cookie passwordCookie=new Cookie("password",password);
                //设置有效期--1天
                telephoneCookie.setMaxAge(24*60*60);
                passwordCookie.setMaxAge(24*60*60);
                //加入到响应中
                response.addCookie(telephoneCookie);
                response.addCookie(passwordCookie);
            }
            session.setAttribute("user",user);
            request.getRequestDispatcher(request.getContextPath()+"/index.jsp").forward(request,response);
        }else {
            request.setAttribute("msg","手机号码与密码不匹配");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }

    //退出登录
    public void logout(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        request.getRequestDispatcher(request.getContextPath()+"/index.jsp").forward(request,response);
    }

    //校验手机号
    public void validatePhone(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String phone = request.getParameter("phone");
        boolean flag = service.validatePhone(phone);
        String message = "";
        if (flag){
            message = "该手机号已被占用";
        }else {
            message = "该手机号未被占用";
        }

        JSONObject object = new JSONObject();
        object.put("flag",Boolean.toString(flag));
        object.put("msg",message);
        PrintWriter pw = response.getWriter();
        pw.write(object.toString());
        pw.flush();
        pw.close();
    }


    //校验用户昵称
    public void validateUsername(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String phone = request.getParameter("username");
        boolean flag = service.validateUsername("username");
        String message = "";
        if (flag){
            message = "该昵称已被占用";
        }else {
            message = "该昵称未被占用";
        }

        JSONObject object = new JSONObject();
        object.put("flag",Boolean.toString(flag));
        object.put("msg",message);
        PrintWriter pw = response.getWriter();
        pw.write(object.toString());
        pw.flush();
        pw.close();
    }
}
