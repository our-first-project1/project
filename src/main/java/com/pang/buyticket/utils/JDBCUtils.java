package com.pang.buyticket.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @version 1.0
 * @Description JDBC工具类
 * @Author chenmin
 * @Date 2021/11/23 15:10
 */
public class JDBCUtils {

    //创建数据源
    private static DataSource dataSource = new ComboPooledDataSource("mysql");

    //创建线程变量
    private static ThreadLocal<Connection> tl = new ThreadLocal<>();

    // 直接可以获取一个连接池
    public static DataSource getDataSource(){
        return dataSource;
    }

    //获得连接的方法
    public static Connection getConn(){
        Connection connection = tl.get();
        try {
            if(connection==null || connection.isClosed()){
                connection = dataSource.getConnection();
                tl.set(connection);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    //开启事务
    public static void startTransaction(){
        Connection conn = getConn();
        if (conn!=null){
            try {
                conn.setAutoCommit(false);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 事务回滚
    public static void rollback(){
        Connection conn = getConn();
        if (conn!=null){
            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 提交并且 关闭资源及从ThreadLocal中释放
    public static void commitAndRelease(){
        Connection conn = getConn();
        if (conn!=null){
            try {
                conn.commit();
                conn.close();
                tl.remove();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //关闭资源的方法
    public static void close(){
        Connection connection =  getConn();
        if(connection!=null){
            try {
                connection.close();
                tl.remove();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
