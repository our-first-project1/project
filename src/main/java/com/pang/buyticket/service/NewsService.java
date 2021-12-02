package com.pang.buyticket.service;

import com.pang.buyticket.dao.impl.NewsDao;
import com.pang.buyticket.entity.News;
import com.pang.buyticket.utils.JDBCUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/12/2 10:00
 */
public class NewsService {

    private NewsDao dao = new NewsDao();


    public List<News> getNews() {
        List<News> news = null;
        try {
            news = dao.getNowNew();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return news;
    }
}
