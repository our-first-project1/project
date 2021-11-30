package com.pang.buyticket.service;

import com.pang.buyticket.dao.impl.TicketListDao;
import com.pang.buyticket.utils.JDBCUtils;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/30 20:09
 */
public class TicketListService {

    private TicketListDao dao = new TicketListDao();

    //通过三个字段查询车票
    public List<Map<String, Object>> searchTicket(String departTime, String departCity, String destCity) {
        List<Map<String, Object>> maps = null;
        try {
            maps = dao.searchTicket(departTime, departCity, destCity);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return maps;
    }

    //通过起、终点城市查询
    public List<Map<String, Object>> searchTicketByRoute(String departCity, String destCity) {

        List<Map<String, Object>> maps = null;
        try {
            maps = dao.searchTicketByRoute(departCity,destCity);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return maps;
    }

    //起始城市
    public List<String> searchDepartCity(){
        List<String> list = null;
        try {
            list = dao.searchDepartCity();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return list;
    }


    //终点城市
    public List<String> searchDestCity(){
        List<String> list = null;
        try {
            list = dao.searchDestCity();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return list;
    }
}
