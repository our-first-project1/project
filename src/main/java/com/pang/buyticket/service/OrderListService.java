package com.pang.buyticket.service;

import com.pang.buyticket.dao.impl.OrderListDao;
import com.pang.buyticket.entity.OrdersList;
import com.pang.buyticket.utils.JDBCUtils;

import java.sql.SQLException;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/12/2 12:58
 */
public class OrderListService {

    private OrderListDao dao = new OrderListDao();

    public boolean insertOrder(OrdersList ordersList){

        int i = 0;
        try {
            i = dao.insertOrder(ordersList);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return i>0;
    }
}
