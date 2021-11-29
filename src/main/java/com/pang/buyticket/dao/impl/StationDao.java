package com.pang.buyticket.dao.impl;

import com.pang.buyticket.dao.BaseDao;
import com.pang.buyticket.dao.IStationDao;
import com.pang.buyticket.entity.Station;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/29 16:00
 */
public class StationDao extends BaseDao<Station> implements IStationDao {

    @Override
    public List<Station> selectStation(Object... params) throws SQLException {
        String sql = "select * from station where city = ? and stationName = ?";
        List<Station> list = this.getBeanList(sql, Station.class, params[0], params[1]);
        return list;
    }

    @Override
    public List<Station> selectByCity(Object... params) throws SQLException {
        String sql = "select * from station from where city = ?";
        List<Station> list = this.getBeanList(sql, Station.class, params);
        return list;
    }

    @Override
    public List<Station> selectBystationName(Object... params) throws SQLException {
        String sql = "select * from station from where stationName like concat('%',?,'%')";
        List<Station> list = this.getBeanList(sql, Station.class, params);
        return list;
    }


}
