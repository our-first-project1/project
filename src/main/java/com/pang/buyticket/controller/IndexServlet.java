package com.pang.buyticket.controller;

import com.pang.buyticket.entity.News;
import com.pang.buyticket.entity.Route;
import com.pang.buyticket.service.NewsService;
import com.pang.buyticket.service.RouteService;
import com.pang.buyticket.service.TicketListService;

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
 * @Date 2021/12/1 20:00
 */
@WebServlet(name = "IndexServlet",urlPatterns = "/index")
public class IndexServlet extends BasicServlet {
    //渲染主界面中的热点路线、和热门班次，新闻

    private RouteService routeService = new RouteService();
    private TicketListService ticketListService = new TicketListService();
    private NewsService newsService = new NewsService();

    public void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Route> routes = routeService.selectHot();
        ticketListService.selectIndex();
        List<News> news = newsService.getNews();

        request.setAttribute("routes",routes);
        request.setAttribute("news",news);
        request.getRequestDispatcher(request.getContextPath()+"/index.jsp").forward(request,response);
    }
}
