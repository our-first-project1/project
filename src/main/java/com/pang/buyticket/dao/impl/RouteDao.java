package com.pang.buyticket.dao.impl;

import com.pang.buyticket.dao.BaseDao;
import com.pang.buyticket.dao.IRouteDao;
import com.pang.buyticket.entity.Route;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/29 20:11
 */
public class RouteDao extends BaseDao<Route> implements IRouteDao {


    @Override
    public List<Route> selectRoute(Object... params) throws SQLException {
        String sql = "select * from route where routeDepartCity = ? and routeDestCity = ?";
        List<Route> routes = this.getBeanList(sql, Route.class, params[0], params[1]);

        return routes;
    }

    @Override
    public List<Route> selectByDepartCity(Object... params) throws SQLException {
        String sql = "select * from route where routeDepartCity like concat('%',?,'%')";
        List<Route> routes = this.getBeanList(sql, Route.class, params[0]);
        return routes;
    }

    @Override
    public List<Route> selectByDestCity(Object... params) throws SQLException {
        String sql = "select * from route where routeDestCity like concat('%',?,'%')";
        List<Route> routes = this.getBeanList(sql, Route.class, params[0]);
        return routes;
    }
}
