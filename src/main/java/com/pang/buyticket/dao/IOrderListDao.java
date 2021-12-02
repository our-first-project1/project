package com.pang.buyticket.dao;

import com.pang.buyticket.entity.OrdersList;

import java.sql.SQLException;

public interface IOrderListDao {

    //插入订单
    public int insertOrder(OrdersList ordersList) throws SQLException;
}
