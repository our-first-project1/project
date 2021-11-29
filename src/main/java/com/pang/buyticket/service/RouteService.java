package com.pang.buyticket.service;

import com.pang.buyticket.dao.impl.RouteDao;
import com.pang.buyticket.entity.Route;
import com.pang.buyticket.utils.JDBCUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/29 20:21
 */
public class RouteService {

    private RouteDao dao = new RouteDao();

    public List<Route> selectRoute(String routeDepartCity, String routeDestCity) {
        List<Route> list = null;
        //起点不为null时
        if (routeDepartCity!=null && !"".equals(routeDepartCity)){

            try {
                list = dao.selectRoute(routeDepartCity,routeDestCity);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                JDBCUtils.close();
            }

        }else {
            try {
                list = dao.selectByDestCity(routeDestCity);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                JDBCUtils.close();
            }
        }
        return list;
    }
}
