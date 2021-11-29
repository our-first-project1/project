package com.pang.buyticket.controller;

import com.pang.buyticket.entity.Route;
import com.pang.buyticket.service.RouteService;

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
 * @Date 2021/11/29 20:47
 */
@WebServlet(name = "RouteServlet",urlPatterns = "/route")
public class RouteServlet extends BasicServlet {

    private RouteService service = new RouteService();

    public void searchRoute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String routeDepartCity = request.getParameter("routeDepartCity");
        String routeDestCity = request.getParameter("routeDestCity");

        System.out.println(routeDepartCity);

        List<Route> routes = service.selectRoute(routeDepartCity, routeDestCity);

        System.out.println(routes);

        request.setAttribute("routes",routes);
        request.getRequestDispatcher(request.getContextPath()+"/route.jsp").forward(request,response);
    }
}
