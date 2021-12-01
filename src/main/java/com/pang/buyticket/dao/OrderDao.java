package com.pang.buyticket.dao;

import com.pang.buyticket.entity.OrdersList;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author Seria
 * @Data 2021/11/29  19:02
 * @Description (What for)
 */
public class OrderDao extends BaseDao<OrdersList> {
    //查询订单总数
    public Long selectCounts(String query) throws SQLException {
        String sql = "select count(*) from orderslist where userId like concat('%',?,'%')";
        Object value = this.getSingleValue(sql, query);
        return Long.valueOf(value.toString());
    }

    //根据条件，模糊查询订单信息，分页
    public List<OrdersList> selectAllByQuery(String query,Integer begin) throws SQLException {
        String sql = "select * from orderslist where userId like concat('%',?,'%') limit ?,5";
        List<OrdersList> list = this.getBeanList(sql, OrdersList.class, query, begin);
        return list;
    }


}
