package com.pang.buyticket.controller;

import com.pang.buyticket.entity.OrdersList;
import com.pang.buyticket.service.OrdersService;
import com.pang.buyticket.vo.PageVO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "OrdersServlet" , urlPatterns = "/orders")
public class OrdersServlet extends HttpServlet {

    private OrdersService service = new OrdersService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        if(code!=null && !code.equals("")){
            switch (code){
                case "viewAll":
                    String query = request.getParameter("query");
                    String page = request.getParameter("pageNow");
                    if(query==null){
                        query = "";//默认空串
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
                    request.getRequestDispatcher("orderlist.jsp").forward(request,response);
                    break;
                case "viewOne":
                    break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
