package com.pang.buyticket.service;

import com.pang.buyticket.dao.UserDao;
import com.pang.buyticket.entity.User;
import com.pang.buyticket.utils.CommonUtils;
import com.pang.buyticket.utils.JDBCUtils;

import java.sql.SQLException;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/28 14:43
 */
public class UserService {

    private UserDao dao = new UserDao();

    public boolean register(User user){
        user.setUid(CommonUtils.getUUID());
        int i = 0;
        try {
            i = dao.insertUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return i>0;
    }

    public User login(String telephone,String password){
        User user = null;
        try {
            user = dao.selectUser(telephone, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return user;
    }

    public boolean validatePhone(String phone) {

        User user = null;
        try {
            user = dao.selectPhone(phone);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        if (user!=null){
            return true;
        }
        return false;
    }

    public boolean validateUsername(String username) {
        User user = null;
        try {
            user = dao.selectUsername(username);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        if (user!=null){
            return true;
        }
        return false;

    }
}
