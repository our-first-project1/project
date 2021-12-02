package com.pang.buyticket.controller;

import com.pang.buyticket.service.TicketListService;
import com.pang.buyticket.vo.PageVO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
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
        String page = request.getParameter("pageNow");
        Integer pageNow = 0;
        if(page==null){
            pageNow=1;
        }else{
            pageNow =Integer.valueOf(page);
        }
        PageVO<Map<String, Object>> vo = service.searchTicket(departTime, departCity, destCity, pageNow);
        request.setAttribute("vo",vo);
        request.getRequestDispatcher(request.getContextPath()+"/ticketlist.jsp").forward(request,response);


        /*//查询起始终点城市
        List<Map<String, Object>> mapDepartList = service.searchDepartCity();
        List<Map<String, Object>> mapDestList = service.searchDestCity();


        request.setAttribute("mapDepartList",mapDepartList);
        request.setAttribute("mapDestList",mapDestList);

       request.getRequestDispatcher(request.getContextPath()+"/queryTicket.jsp").forward(request,response);*/
    }

    //通过路线进行预定
    public void buyTicketByRoute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String routeDepartCity = request.getParameter("routeDepartCity");
        String routeDestCity = request.getParameter("routeDestCity");
        String routePrice = request.getParameter("routePrice");

        //查询起始终点城市
        List<Map<String, Object>> mapDepartList = service.searchDepartCity();
        List<Map<String, Object>> mapDestList = service.searchDestCity();
        List<Map<String, Object>> mapList = service.searchTicketByRoute(routePrice,routeDepartCity, routeDestCity);
        System.out.println(mapList);

        request.setAttribute("mapDepartList",mapDepartList);
        request.setAttribute("mapDestList",mapDestList);
        request.setAttribute("mapList",mapList);

        request.getRequestDispatcher(request.getContextPath()+"/queryTicket.jsp").forward(request,response);
    }

    //进入预约订单中
    public void downOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String departDate = request.getParameter("departDate");
        String departTime = request.getParameter("departTime");
        String departStation = request.getParameter("departStation");
        String destStation = request.getParameter("destStation");


        request.setAttribute("departDate",departDate);
        request.setAttribute("departTime",departTime);
        request.setAttribute("departStation",departStation);
        request.setAttribute("destStation",destStation);
        request.getRequestDispatcher(request.getContextPath()+"/order.jsp").forward(request,response);
    }

  /*  //进入热点路线中预约订单中
    public void downRouteOrder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String routeDepartCity = request.getParameter("routeDepartCity");
        String routeDestCity = request.getParameter("routeDestCity");
        String routePrice = request.getParameter("routePrice");


    }*/

}
