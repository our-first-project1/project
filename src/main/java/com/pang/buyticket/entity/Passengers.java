package com.pang.buyticket.entity;

import java.util.Date;

/**
 * @Description 乘客信息表
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/27 20:33
 */
public class Passengers {

    //乘客编号
    private int pid;
    //乘客姓名
    private String pName;
    //身份证号
    private Long pPersonId;
    //联系方式
    private String pTelephone;
    //出行日期
    private Date pDate;
    //车次编号
    private String pTicketId;


    public Passengers() {
    }

    public Passengers(int pid, String pName, Long pPersonId, String pTelephone, Date pDate, String pTicketId) {
        this.pid = pid;
        this.pName = pName;
        this.pPersonId = pPersonId;
        this.pTelephone = pTelephone;
        this.pDate = pDate;
        this.pTicketId = pTicketId;
    }

    /**
     * 获取
     * @return pid
     */
    public int getPid() {
        return pid;
    }

    /**
     * 设置
     * @param pid
     */
    public void setPid(int pid) {
        this.pid = pid;
    }

    /**
     * 获取
     * @return pName
     */
    public String getPName() {
        return pName;
    }

    /**
     * 设置
     * @param pName
     */
    public void setPName(String pName) {
        this.pName = pName;
    }

    /**
     * 获取
     * @return pPersonId
     */
    public Long getPPersonId() {
        return pPersonId;
    }

    /**
     * 设置
     * @param pPersonId
     */
    public void setPPersonId(Long pPersonId) {
        this.pPersonId = pPersonId;
    }

    /**
     * 获取
     * @return pTelephone
     */
    public String getPTelephone() {
        return pTelephone;
    }

    /**
     * 设置
     * @param pTelephone
     */
    public void setPTelephone(String pTelephone) {
        this.pTelephone = pTelephone;
    }

    /**
     * 获取
     * @return pDate
     */
    public Date getPDate() {
        return pDate;
    }

    /**
     * 设置
     * @param pDate
     */
    public void setPDate(Date pDate) {
        this.pDate = pDate;
    }

    /**
     * 获取
     * @return pTicketId
     */
    public String getPTicketId() {
        return pTicketId;
    }

    /**
     * 设置
     * @param pTicketId
     */
    public void setPTicketId(String pTicketId) {
        this.pTicketId = pTicketId;
    }

    @Override
    public String toString() {
        return "Passengers{pid = " + pid + ", pName = " + pName + ", pPersonId = " + pPersonId + ", pTelephone = " + pTelephone + ", pDate = " + pDate + ", pTicketId = " + pTicketId + "}";
    }
}
