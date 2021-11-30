package com.pang.buyticket.controller;

import com.pang.buyticket.service.TicketListService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/30 19:51
 */

@WebServlet(name = "TicketListServlet",urlPatterns = "/ticket")
public class TicketListServlet extends BasicServlet {

    private TicketListService service = new TicketListService();

    //通过时间，起始，终止站操作
    public void buyTicket(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String departCity = request.getParameter("departCity");
        String destCity = request.getParameter("destCity");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(request.getParameter("departTime"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String departTime = sdf.format(date);
        //查询票列表
        List<Map<String, Object>> mapList = service.searchTicket(departTime, departCity, destCity);
        //查询起始终点城市
        List<String> departList = service.searchDepartCity();
        List<String> destList = service.searchDestCity();

        request.setAttribute("departList",departList);
        request.setAttribute("destList",destList);
        request.setAttribute("mapList",mapList);

        request.getRequestDispatcher(request.getContextPath()+"/queryTicket.jsp").forward(request,response);
    }


    public void buyTicketByRoute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String departCity = request.getParameter("departCity");
        String destCity = request.getParameter("destCity");

        List<Map<String, Object>> mapList = service.searchTicketByRoute(departCity, destCity);
        List<String> departList = service.searchDepartCity();
        List<String> destList = service.searchDestCity();

        request.setAttribute("departList",departList);
        request.setAttribute("destList",destList);
        request.setAttribute("mapList",mapList);

        request.getRequestDispatcher(request.getContextPath()+"/queryTicket.jsp").forward(request,response);
    }

}
