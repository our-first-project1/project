package com.pang.buyticket.dao;

import com.pang.buyticket.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDao {

    //查询单个用户
    public User selectUser(Object... params) throws SQLException;

    //查询所有用户
    public List<User> selectAll(Object... params) throws Exception;

    //增
    public int insertUser(User user) throws Exception;

    //改
    public int updateUser(User user) throws Exception;

    //删
    public int deleteUser(Object... params) throws Exception;
}
