package com.pang.buyticket.dao.impl;

import com.pang.buyticket.dao.BaseDao;
import com.pang.buyticket.dao.INewsDao;
import com.pang.buyticket.entity.News;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/12/1 23:04
 */
public class NewsDao extends BaseDao<News> implements INewsDao {

    @Override
    public List<News> getNowNew() throws SQLException {
        String sql = "select * from news";
        List<News> newsList = this.getBeanList(sql, News.class);
        return newsList;
    }

}
