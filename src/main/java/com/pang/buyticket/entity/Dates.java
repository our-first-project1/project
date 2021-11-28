package com.pang.buyticket.entity;

import java.util.Date;

/**
 * @Description 日期表
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/27 19:26
 */
public class Dates {

    //出发日期编号
    private int dateId;
    //出发日期
    private Date departDate;


    public Dates() {
    }

    public Dates(int dateId, Date departDate) {
        this.dateId = dateId;
        this.departDate = departDate;
    }

    /**
     * 获取
     * @return dateId
     */
    public int getDateId() {
        return dateId;
    }

    /**
     * 设置
     * @param dateId
     */
    public void setDateId(int dateId) {
        this.dateId = dateId;
    }

    /**
     * 获取
     * @return departDate
     */
    public Date getDepartDate() {
        return departDate;
    }

    /**
     * 设置
     * @param departDate
     */
    public void setDepartDate(Date departDate) {
        this.departDate = departDate;
    }

    @Override
    public String toString() {
        return "Dates{dateId = " + dateId + ", departDate = " + departDate + "}";
    }
}
