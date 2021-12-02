package com.pang.buyticket.dao.impl;

import com.pang.buyticket.dao.BaseDao;
import com.pang.buyticket.dao.IOrderListDao;
import com.pang.buyticket.entity.OrdersList;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/12/2 11:31
 */
public class OrderListDao extends BaseDao<OrdersList> implements IOrderListDao {

    @Override
    public int insertOrder(OrdersList ordersList) throws SQLException {
        String sql = "insert into orderslist values(?,?,? ,?,?,?, ? ,?,?, ?,?,?, ?,?,?, ?,?,?, ?,?)";
        int i = this.update(sql, ordersList.getOrderId(), ordersList.getOperateTime(), ordersList.getDepartDate(), ordersList.getDepartTime(),
                ordersList.getTicketId(), ordersList.getBusType(), ordersList.getCheckoutId(), ordersList.getTicketStatus(),
                ordersList.getTicketType(), ordersList.getTicketPrice(), ordersList.getName(), ordersList.getPersonId(), ordersList.getTelephone(),
                ordersList.getSeatId(), ordersList.getDepartStation(), ordersList.getDestStation(), ordersList.getInsurance(),
                ordersList.getTakeChildren(), ordersList.getUserId(), ordersList.getOrderStatus());
        return i;
    }

    //查询订单总数
    @Override
    public Long selectCounts(String query) throws SQLException {
        String sql = "select count(*) from orderslist where name like concat('%',?,'%')";
        Object value = this.getSingleValue(sql, query);
        return Long.valueOf(value.toString());
    }

    //根据条件，模糊查询订单信息，分页
    @Override
    public List<OrdersList> selectAllByQuery(String query, Integer begin) throws SQLException {
        String sql = "select * from orderslist where name like concat('%',?,'%') limit ?,5";
        List<OrdersList> list = this.getBeanList(sql, OrdersList.class, query, begin);
        return list;
    }

}
