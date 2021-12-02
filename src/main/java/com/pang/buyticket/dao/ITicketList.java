package com.pang.buyticket.dao;

import com.pang.buyticket.entity.TicketList;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ITicketList {


    //通过直接查票订购
    public List<Map<String,Object>> searchTicket(Object...params) throws SQLException;

    //通过路线进行定购(出发城市，终点城市)
    public List<Map<String,Object>> searchTicketByRoute(Object...params) throws SQLException;

    //获取当前所有出发城市
    public List<Map<String,Object>> searchDepartCity() throws SQLException;

    //获取当前所有终点城市
    public List<Map<String,Object>> searchDestCity() throws SQLException;

    //通过时间车站信息查询
    public TicketList selectOne(Object...params) throws SQLException;

    public int updateCount(Object...params) throws SQLException;
}
