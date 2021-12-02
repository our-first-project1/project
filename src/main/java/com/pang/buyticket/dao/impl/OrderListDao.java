package com.pang.buyticket.dao.impl;

import com.pang.buyticket.dao.BaseDao;
import com.pang.buyticket.dao.IOrderListDao;
import com.pang.buyticket.entity.OrdersList;

import java.sql.SQLException;

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

}
