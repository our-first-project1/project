package com.pang.buyticket.dao;

import com.pang.buyticket.entity.Route;

import java.sql.SQLException;
import java.util.List;

public interface IRouteDao {

    //通过城市和车站名查询
    public List<Route> selectRoute(Object... params) throws SQLException;

    //通过起点城市查询
    public List<Route> selectByDepartCity(Object... params) throws SQLException;

    //通过终点城市查询
    public List<Route> selectByDestCity(Object... params) throws SQLException;

    //查询热点路线
    public List<Route> selectHot() throws SQLException;
}
