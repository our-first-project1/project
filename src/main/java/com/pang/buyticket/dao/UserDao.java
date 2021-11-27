package com.pang.buyticket.dao;



import com.pang.buyticket.entity.User;

import java.sql.SQLException;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/26 10:55
 */
public class UserDao extends BaseDao<User> {

    public User selectUser(String telephone,String password) throws SQLException {
        String sql = "select * from users where telephone = ? and password = ?";
        User user = this.getBean(sql, User.class, telephone,password);
        return user;
    }

    public boolean insertUser(String sql,Object...params) throws SQLException {
        int i = this.update(sql, params);
        return i>0;
    }
}
