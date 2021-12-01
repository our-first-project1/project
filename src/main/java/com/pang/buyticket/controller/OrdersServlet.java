package com.pang.buyticket.controller;

import com.pang.buyticket.entity.OrdersList;
import com.pang.buyticket.entity.User;
import com.pang.buyticket.service.OrdersService;
import com.pang.buyticket.vo.PageVO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "OrdersServlet" , urlPatterns = "/orders")
public class OrdersServlet extends BasicServlet {

    private OrdersService service = new OrdersService();

    public void viewAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String query = null;
        String page = request.getParameter("pageNow");
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");
        if(user instanceof User){
            query = ((User) user).getUid();
        }
        Integer pageNow = 0;
        if(page==null){
            pageNow=1;
        }else{
            pageNow =Integer.valueOf(page);
        }
        //执行分页业务
        PageVO<OrdersList> vo = service.paging(query , pageNow);
        request.setAttribute("vo",vo);
        request.getRequestDispatcher(request.getContextPath()+"/orderlist.jsp").forward(request,response);
    }

    /*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("code");
        if(method!=null && !method.equals("")){
            switch (method){
                case "viewAll":
                    String query = null;
                    String page = request.getParameter("pageNow");
                    HttpSession session = request.getSession();
                    Object user = session.getAttribute("user");
                    if(user instanceof User){
                        query = ((User) user).getUid();
                    }
                    Integer pageNow = 0;
                    if(page==null){
                        pageNow=1;
                    }else{
                        pageNow =Integer.valueOf(page);
                    }
                    //执行分页业务
                    PageVO<OrdersList> vo = service.paging(query , pageNow);
                    request.setAttribute("vo",vo);
                    request.getRequestDispatcher(request.getContextPath()+"/orderlist.jsp").forward(request,response);
                    break;
                case "viewOne":
                    break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }*/
}
