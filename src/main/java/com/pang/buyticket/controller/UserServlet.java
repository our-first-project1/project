package com.pang.buyticket.controller;

import com.alibaba.fastjson.JSONObject;
import com.pang.buyticket.entity.User;
import com.pang.buyticket.service.UserService;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }
    }

    public void login(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        String telephone = request.getParameter("telephone");
        String password = request.getParameter("password");
        User user = service.login(telephone, password);
        if (user!=null){
            HttpSession session = request.getSession();
            session.setAttribute("user",user);

            request.getRequestDispatcher(request.getContextPath()+"/index.jsp").forward(request,response);
        }else {
            request.setAttribute("msg","??????????????????????????????");
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }

    //????????????
    public void logout(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        request.getRequestDispatcher(request.getContextPath()+"/index.jsp").forward(request,response);
    }

    //???????????????
    public void validatePhone(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String phone = request.getParameter("phone");
        boolean flag = service.validatePhone(phone);
        String message = "";
        if (flag){
            message = "????????????????????????";
        }else {
            message = "????????????????????????";
        }

        JSONObject object = new JSONObject();
        object.put("flag",Boolean.toString(flag));
        object.put("msg",message);
        PrintWriter pw = response.getWriter();
        pw.write(object.toString());
        pw.flush();
        pw.close();
    }


    //??????????????????
    public void validateUsername(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String phone = request.getParameter("username");
        boolean flag = service.validateUsername("username");
        String message = "";
        if (flag){
            message = "?????????????????????";
        }else {
            message = "?????????????????????";
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
