package com.pang.buyticket.service;

import com.pang.buyticket.dao.OrderDao;
import com.pang.buyticket.entity.OrdersList;
import com.pang.buyticket.vo.PageVO;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author Seria
 * @Data 2021/11/29  19:16
 * @Description (What for)
 */
public class OrdersService {

    private OrderDao dao = new OrderDao();

    //根据条件+分页 查询
    public PageVO<OrdersList> paging(String query , Integer pageNow ){
        PageVO<OrdersList> vo =null;
        try {
            //总记录数
            Integer myCounts = Integer.valueOf(dao.selectCounts(query).toString());
            //总页数
            Integer myPages = myCounts%5==0?myCounts/5:((int)Math.ceil(myCounts/5));
            //数据
            Integer begin = (pageNow-1)*5;
            List<OrdersList> list = dao.selectAllByQuery(query, begin);
            vo = new PageVO<>(pageNow,myCounts,myPages,query,null,list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vo;
    }


}
