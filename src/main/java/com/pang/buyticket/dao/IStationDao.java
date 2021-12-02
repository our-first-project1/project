package com.pang.buyticket.dao;

import com.pang.buyticket.entity.Station;

import java.sql.SQLException;
import java.util.List;

public interface IStationDao {

    //通过城市和车站名查询
    public List<Station> selectStation(Object... params) throws SQLException;

    //通过城市查询车站
    public List<Station> selectByCity(Object... params) throws SQLException;

    //通过车站名查询
    public List<Station> selectBystationName(Object... params) throws SQLException;
}
