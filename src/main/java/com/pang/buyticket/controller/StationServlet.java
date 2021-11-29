package com.pang.buyticket.controller;

import com.pang.buyticket.entity.Station;
import com.pang.buyticket.service.StationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/29 16:13
 */

@WebServlet(name = "StationServlet",urlPatterns = "/station")
public class StationServlet extends BasicServlet {

    private StationService service = new StationService();

    public void searchStation(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String city = request.getParameter("city");
        String stationName = request.getParameter("stationName");

        List<Station> list = service.selectStation(city, stationName);

        request.setAttribute("list",list);

        request.getRequestDispatcher(request.getContextPath()+"/busStation.jsp").forward(request,response);

    }
}
