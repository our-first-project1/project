package com.pang.buyticket.dao.impl;



import com.pang.buyticket.dao.BaseDao;
import com.pang.buyticket.dao.IUserDao;
import com.pang.buyticket.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/26 10:55
 */
public class UserDao extends BaseDao<User> implements IUserDao {


    @Override
    public User selectUser(Object...params) throws SQLException {
        String sql = "select * from users where telephone = ? and password = ?";
        User user = this.getBean(sql, User.class, params[0],params[1]);
        return user;
    }


    @Override
    public List<User> selectAll(Object... params) throws Exception {
        return null;
    }

    @Override
    public int insertUser(User user) throws SQLException {
        String sql = "insert into users values(?,?,?,?,?,?,?,?,?,null)";
        int i = this.update(sql,user.getUid(),user.getUsername(),user.getPassword(),user.getName(),
                user.getPersonId(),user.getEmail(),user.getTelephone(),user.getBirthday(),user.getSex());

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

    @Override
    public int updateUser(User user) throws Exception {
        return 0;
    }

    @Override
    public int deleteUser(Object... params) throws Exception {
        return 0;
    }
}
