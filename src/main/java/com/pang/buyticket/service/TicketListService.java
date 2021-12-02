package com.pang.buyticket.service;

import com.pang.buyticket.dao.impl.TicketListDao;
import com.pang.buyticket.entity.TicketList;
import com.pang.buyticket.utils.JDBCUtils;
import com.pang.buyticket.vo.PageVO;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/30 20:09
 */
public class TicketListService {

    private TicketListDao dao = new TicketListDao();

    //通过三个字段查询车票
    public PageVO<Map<String,Object>> searchTicket(String departTime, String departCity, String destCity,Integer pageNow) {
        List<Map<String, Object>> maps = null;
        PageVO<Map<String,Object>> vo =null;
        try {
            Integer myCounts = Integer.valueOf(dao.selectCounts(departTime, departCity, destCity).toString());
            //总页数
            Integer myPages = myCounts%5==0?myCounts/5:(myCounts/5)+1;
            //数据
            Integer begin = (pageNow-1)*5;
            maps = dao.searchTicket(departTime, departCity, destCity,begin);
            vo=new PageVO<>(pageNow,myCounts,myPages,null,null,maps);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return vo;
    }

    //通过路线进行查询查询
    public List<Map<String, Object>> searchTicketByRoute(String routePrice,String routeDepartCity, String routeDestCity) {

        List<Map<String, Object>> maps = null;
        try {
            maps = dao.searchTicketByRoute(routePrice,routeDepartCity,routeDestCity);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return maps;
    }

    //起始城市
    public List<Map<String,Object>> searchDepartCity(){
        List<Map<String,Object>> listDepartCity = null;
        try {
            listDepartCity = dao.searchDepartCity();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return listDepartCity;
    }


    //终点城市
    public List<Map<String,Object>> searchDestCity(){
        List<Map<String,Object>> listDestCity = null;
        try {
            listDestCity = dao.searchDestCity();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return listDestCity;
    }

    public List<TicketList> selectIndex() {
        List<TicketList> ticketLists = null;
        ticketLists = dao.searchIndex();
        return null;
    }

    public TicketList selectOne(String departTime, String departStation, String destStation) {

        TicketList ticketList = null;
        try {
            ticketList = dao.selectOne(departTime, departStation, destStation);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return ticketList;
    }

    public boolean updateSeat(String ticketId,int count) {
        int i = 0;
        try {
            i = dao.updateCount(count, ticketId);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return i>0;
    }
}
