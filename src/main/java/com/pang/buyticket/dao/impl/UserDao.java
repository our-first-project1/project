package com.pang.buyticket.dao.impl;



import com.pang.buyticket.dao.BaseDao;
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

    public int insertUser(User user) throws SQLException {
        String sql = "insert into users values(?,?,?,?,?,?,?,?,?,null,0,?)";
        int i = this.update(sql,user.getUid(),user.getUsername(),user.getPassword(),user.getName(),
                user.getPersonId(),user.getEmail(),user.getTelephone(),user.getBirthday(),user.getSex(),
                user.getCode());

        return i;
    }

    public User selectPhone(String phone) throws SQLException {
        String sql = "select * from users where telephone = ?";
        User user = this.getBean(sql, User.class, phone);
        return user;
    }

    public User selectUsername(String username) throws SQLException {
        String sql = "select * from users where username = ?";
        User user = this.getBean(sql, User.class, username);
        return user;
    }

    public int updateState(String code) throws SQLException {
        String sql = "update users set state = 1 where code=?";
        int i = this.update(sql, code);
        return i;
    }
}
