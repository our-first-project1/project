package com.pang.buyticket.controller;

import com.pang.buyticket.entity.OrdersList;
import com.pang.buyticket.entity.TicketList;
import com.pang.buyticket.entity.User;
import com.pang.buyticket.service.OrderListService;
import com.pang.buyticket.service.PassengersService;
import com.pang.buyticket.service.TicketListService;
import com.pang.buyticket.utils.CommonUtils;
import com.pang.buyticket.vo.PageVO;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/12/2 13:00
 */
@WebServlet(name = "OrdersListServlet",urlPatterns = "/order")
public class OrdersListServlet extends BasicServlet {

    private PassengersService passengersService = new PassengersService();

    private OrderListService orderListService = new OrderListService();

    private TicketListService ticketListService = new TicketListService();

    public void insertOrderList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //出行日期
        String departDate = request.getParameter("departDate");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(departDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //出发时间
        String departTime = request.getParameter("departTime");
        //始发站
        String departStation = request.getParameter("departStation");
        //终点站
        String destStation = request.getParameter("destStation");
        TicketList ticketList = ticketListService.selectOne(departTime, departStation, destStation);


        //乘车人姓名
        String name = request.getParameter("name");
        //身份证号
        Long personId = Long.valueOf(request.getParameter("personId"));
        //电话
        String telephone = request.getParameter("telephone");
        //车票类型1全票0半票
        String ticketType = request.getParameter("ticketType");
        //购买保险1购买0不买
        String insurance = request.getParameter("insurance");
        //携带儿童1携带，0不带
        Integer takeChildren = Integer.valueOf(request.getParameter("takeChildren"));
        double price = 0.0;
        if (takeChildren == 1){
            price = ticketList.getTicketPrice()*3/2;
        }else {
            price = ticketList.getTicketPrice();
        }

        SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String operateTime = sdfTime.format(now);
        Random random = new Random();
        int i = random.nextInt(4)+1;

        //从session会话中获取用户登录者信息
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");

        String id = CommonUtils.getUUID().replaceAll("-", "");
        OrdersList ordersList = new OrdersList(id,operateTime,date,departTime,ticketList.getTicketId(),ticketList.getBusType(),
                i,"0",ticketType,price,name,personId,telephone,ticketList.getTicketCounts(),departStation,destStation,insurance,takeChildren,
                user.getUid(),"0");
        //插入订单
        boolean b = orderListService.insertOrder(ordersList);
        if (b){
            //将票数进行修改
            boolean updateSeat = ticketListService.updateSeat(ticketList.getTicketId(), ticketList.getTicketCounts() - 1);
            if (updateSeat){
                //插入游客
                boolean b1 = passengersService.insertPassengers(name, personId, telephone, date, ticketList.getTicketId());
                if (b1){
                    request.setAttribute("ordersList",ordersList);
                    request.getRequestDispatcher(request.getContextPath()+"/").forward(request,response);
                }
            }
        }

    }


    public void viewAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
        PageVO<OrdersList> vo = orderListService.paging(query , pageNow);
        request.setAttribute("vo",vo);
        request.getRequestDispatcher("orderlist.jsp").forward(request,response);
    }

}
