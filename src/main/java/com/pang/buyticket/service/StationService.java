package com.pang.buyticket.service;

import com.pang.buyticket.dao.impl.StationDao;
import com.pang.buyticket.entity.Station;
import com.pang.buyticket.utils.JDBCUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/29 16:15
 */

public class StationService {

    private StationDao dao = new StationDao();


    public List<Station> selectStation(String city, String stationName) {
        List<Station> list = null;
        if (city!=null && !"".equals(city)){
            if (stationName!=null && !"".equals(stationName)){
                try {
                    list = dao.selectStation(city,stationName);
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    JDBCUtils.close();
                }
            }else {
                try {
                    list = dao.selectByCity(city);
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    JDBCUtils.close();
                }
            }
        }else {
            if (stationName!=null && !"".equals(stationName)){
                try {
                    list = dao.selectBystationName(stationName);
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    JDBCUtils.close();
                }
            }else {
                try {
                    list = dao.selectBystationName("");
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    JDBCUtils.close();
                }
            }
        }
        return list;
    }
}
