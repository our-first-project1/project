package com.pang.buyticket.service;

import com.pang.buyticket.dao.impl.PassengersDao;
import com.pang.buyticket.entity.Passengers;
import com.pang.buyticket.utils.JDBCUtils;

import java.sql.SQLException;
import java.util.Date;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/12/2 14:37
 */
public class PassengersService  {

    private PassengersDao dao = new PassengersDao();

    public boolean insertPassengers(String name, Long personId, String telephone, Date date,String pTicketId){
        int i = 0;
        try {
            i = dao.insertOne(name,personId,telephone,date,pTicketId);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return i>0;
    }
}
