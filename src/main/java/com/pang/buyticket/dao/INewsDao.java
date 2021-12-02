package com.pang.buyticket.dao;

import com.pang.buyticket.entity.News;

import java.sql.SQLException;
import java.util.List;

public interface INewsDao {

    List<News> getNowNew() throws SQLException;

    }
