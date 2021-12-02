package com.pang.buyticket.dao.impl;

import com.pang.buyticket.dao.BaseDao;
import com.pang.buyticket.dao.IPassengersDao;
import com.pang.buyticket.entity.Passengers;

import java.sql.SQLException;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/12/2 14:32
 */
public class PassengersDao extends BaseDao<Passengers> implements IPassengersDao {


    @Override
    public int insertOne(Object...params) throws SQLException {
        String sql = "insert into passengers values(null,?,?,?,?,?)";
        int i = this.update(sql,params);
        return i;
    }
}
