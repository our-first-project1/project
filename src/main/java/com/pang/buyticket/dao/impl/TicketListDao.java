package com.pang.buyticket.dao.impl;

import com.pang.buyticket.dao.BaseDao;
import com.pang.buyticket.dao.ITicketList;
import com.pang.buyticket.entity.TicketList;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/30 18:25
 */
public class TicketListDao extends BaseDao<TicketList> implements ITicketList {

    //通过直接查票订购
    @Override
    public List<Map<String,Object>> searchTicket(Object...params) throws SQLException {
        String sql = "select t.busId busId,t.departStation departStation,t.destStation destStation" +
                ",d.departDate departDate,t.departTime departTime,t.busType busType,t.ticketPrice ticketPrice" +
                ",t.ticketCounts ticketCounts from ticketlist t,dates d where t.ticketStatus = '运营' " +
                "and d.departDate = ? and t.departCity like concat('%',?,'%') and t.destCity like concat('%',?,'%')" +
                "limit ?,5";
        List mapList = this.getMapList(sql, params);
        return mapList;
    }

    //通过路线进行定购(出发城市，终点城市)
    @Override
    public List<Map<String,Object>> searchTicketByRoute(Object...params) throws SQLException {
        /*String sql = "select t.ticketId ticketId,t.departStation departStation,t.destStation destStation," +
                "d.departDate departDate,t.departTime departTime,t.busType busType,t.ticketPrice ticketPrice" +
                ",t.ticketCounts ticketCounts from ticketlist t,dates d where t.ticketStatus = '运营'" +
                " and t.ticketPrice = ? and t.departCity like concat('%',?,'%') and t.destCity like concat('%',?,'%')";*/
        String sql = "select t.ticketId ticketId , t.departStation departStation , t.destStation destStation,\n" +
                "d.departDate departDate , t.departTime departTime , t.busType busType , t.ticketPrice ticketPrice , t.ticketCounts ticketCounts\n" +
                "from ticketlist t,dates d\n" +
                "where t.ticketStatus='运营' and t.ticketPrice=?\n" +
                "and t.departCity like concat('%',?,'%') and t.destCity like concat('%',?,'%') and d.departDate=DATE_FORMAT(now(),'%Y-%m-%d')";
        List mapList = this.getMapList(sql, params);
        return mapList;
    }

    //获取当前所有出发城市
    @Override
    public List<Map<String,Object>> searchDepartCity() throws SQLException {
        String sql = "select distinct departCity from ticketlist";
        //List list = this.getBeanList(sql, Object.class);
        List mapListDepartCity = this.getMapList(sql);
        return mapListDepartCity;
    }

    //获取当前所有终点城市
    @Override
    public List<Map<String,Object>> searchDestCity() throws SQLException {
        String sql = "select distinct destCity from ticketlist";
        //List list = this.getBeanList(sql, Object.class);
        List mapList = this.getMapList(sql);
        return mapList;
    }

    public List<TicketList> searchIndex() {
        String sql = "select departCity,destCity from ticketlist where ";
        return null;
    }

    @Override
    public TicketList selectOne(Object...params) throws SQLException {
        String sql = "select * from ticketlist where departTime=? and departStation=? and destStation=?";
        TicketList ticketList = this.getBean(sql, TicketList.class, params);
        return ticketList;
    }

    @Override
    public int updateCount(Object...params) throws SQLException {
        String sql = "update ticketlist set ticketCounts = ? where ticketId = ?";
        int i = this.update(sql, params);
        return i;
    }

    //查询票总数
    public Long selectCounts(Object...params) throws SQLException{
        String sql = "select count(*) from ticketlist t,dates d where t.ticketStatus = '运营' " +
                "and d.departDate = ? and t.departCity like concat('%',?,'%') and t.destCity like concat('%',?,'%')";
        Object value = this.getSingleValue(sql, params);
        return Long.valueOf(value.toString());
    }
}
