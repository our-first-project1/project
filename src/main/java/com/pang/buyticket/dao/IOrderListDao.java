package com.pang.buyticket.dao;

import com.pang.buyticket.entity.OrdersList;

import java.sql.SQLException;
import java.util.List;

public interface IOrderListDao {

    //插入订单
    public int insertOrder(OrdersList ordersList) throws SQLException;

    //查询订单总数
    public Long selectCounts(String query) throws SQLException;

    //根据条件，模糊查询订单信息，分页
    public List<OrdersList> selectAllByQuery(String query, Integer begin) throws SQLException;
}
