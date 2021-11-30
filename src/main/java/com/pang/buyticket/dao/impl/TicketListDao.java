package com.pang.buyticket.dao.impl;

import com.pang.buyticket.dao.BaseDao;
import com.pang.buyticket.dao.ITicketList;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/30 18:25
 */
public class TicketListDao extends BaseDao implements ITicketList {

    //通过直接查票订购
    @Override
    public List<Map<String,Object>> searchTicket(Object...params) throws SQLException {
        String sql = "select t.ticketId,t.departStation,t.destStation,d.departDate,t.departTime,t.busType,t.ticketPrice,t.ticketCounts from ticketlist t,dates d where d.departDate = ? and t.departCity like concat('%',?,'%') and t.destCity like concat('%',?,'%')";
        List mapList = this.getMapList(sql, params);
        return mapList;
    }

    //通过路线进行定购(出发城市，终点城市)
    @Override
    public List<Map<String,Object>> searchTicketByRoute(Object...params) throws SQLException {
        String sql = "select t.ticketId,t.departStation,t.destStation,d.departDate,t.departTime,t.busType,t.ticketPrice,t.ticketCounts from ticketlist t,dates d where t.departCity like concat('%',?,'%') and t.destCity like concat('%',?,'%')";
        List mapList = this.getMapList(sql, params);
        return mapList;
    }

    //获取当前所有出发城市
    @Override
    public List<String> searchDepartCity() throws SQLException {
        String sql = "select departCity from ticketlist";
        List list = this.getBeanList(sql, String.class);
        return list;
    }

    //获取当前所有终点城市
    @Override
    public List<String> searchDestCity() throws SQLException {
        String sql = "select destCity from ticketlist";
        List list = this.getBeanList(sql, String.class);
        return list;
    }
}
