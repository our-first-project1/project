package com.pang.buyticket.dao;

import com.pang.buyticket.entity.Passengers;

import java.sql.SQLException;

public interface IPassengersDao {

    int insertOne(Object...params) throws SQLException;
}
