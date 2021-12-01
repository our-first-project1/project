package com.pang.buyticket.entity;

import java.util.Date;

/**
 * @Description 订单详情
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/27 19:53
 */
public class OrdersList {

    //订单编号
    private String orderId;
    //下单时间
    private String operateTime;
    //出发日期
    private Date departDate;
    //出发时间
    private String departTime;
    //车次编号
    private String ticketId;
    //汽车类型
    private String busType;
    //检票窗口号
    private int checkoutId;
    //车票状态
    private String ticketStatus;
    //车票类型
    private String ticketType;
    //车票价格
    private Double ticketPrice;
    //乘车人姓名
    private String name;
    //身份证号
    private Long personId;
    //联系方式
    private String telephone;
    //座位号
    private int seatId;
    //起始站
    private String departStation;
    //终点站
    private String destStation;
    //是否购买保险
    private String insurance;
    //是否携带儿童
    private int takeChildren;
    //下单用户编号
    private String userId;
    //订单状态： 0 未付款，可付款； 1 已付款 可改签 可退票； 2 改签过/已过改签时间 可退票
    private int orderStatus;


    public OrdersList() {
    }

    public OrdersList(String orderId, String operateTime, Date departDate, String departTime, String ticketId, String busType, int checkoutId, String ticketStatus, String ticketType, Double ticketPrice, String name, Long personId, String telephone, int seatId, String departStation, String destStation, String insurance, int takeChildren, String userId, int orderStatus) {
        this.orderId = orderId;
        this.operateTime = operateTime;
        this.departDate = departDate;
        this.departTime = departTime;
        this.ticketId = ticketId;
        this.busType = busType;
        this.checkoutId = checkoutId;
        this.ticketStatus = ticketStatus;
        this.ticketType = ticketType;
        this.ticketPrice = ticketPrice;
        this.name = name;
        this.personId = personId;
        this.telephone = telephone;
        this.seatId = seatId;
        this.departStation = departStation;
        this.destStation = destStation;
        this.insurance = insurance;
        this.takeChildren = takeChildren;
        this.userId = userId;
        this.orderStatus = orderStatus;
    }

    /**
     * 获取
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取
     * @return operateTime
     */
    public String getOperateTime() {
        return operateTime;
    }

    /**
     * 设置
     * @param operateTime
     */
    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
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

    /**
     * 获取
     * @return departTime
     */
    public String getDepartTime() {
        return departTime;
    }

    /**
     * 设置
     * @param departTime
     */
    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    /**
     * 获取
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * 设置
     * @param ticketId
     */
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * 获取
     * @return busType
     */
    public String getBusType() {
        return busType;
    }

    /**
     * 设置
     * @param busType
     */
    public void setBusType(String busType) {
        this.busType = busType;
    }

    /**
     * 获取
     * @return checkoutId
     */
    public int getCheckoutId() {
        return checkoutId;
    }

    /**
     * 设置
     * @param checkoutId
     */
    public void setCheckoutId(int checkoutId) {
        this.checkoutId = checkoutId;
    }

    /**
     * 获取
     * @return ticketStatus
     */
    public String getTicketStatus() {
        return ticketStatus;
    }

    /**
     * 设置
     * @param ticketStatus
     */
    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    /**
     * 获取
     * @return ticketType
     */
    public String getTicketType() {
        return ticketType;
    }

    /**
     * 设置
     * @param ticketType
     */
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    /**
     * 获取
     * @return ticketPrice
     */
    public Double getTicketPrice() {
        return ticketPrice;
    }

    /**
     * 设置
     * @param ticketPrice
     */
    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return personId
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * 设置
     * @param personId
     */
    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    /**
     * 获取
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取
     * @return seatId
     */
    public int getSeatId() {
        return seatId;
    }

    /**
     * 设置
     * @param seatId
     */
    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    /**
     * 获取
     * @return departStation
     */
    public String getDepartStation() {
        return departStation;
    }

    /**
     * 设置
     * @param departStation
     */
    public void setDepartStation(String departStation) {
        this.departStation = departStation;
    }

    /**
     * 获取
     * @return destStation
     */
    public String getDestStation() {
        return destStation;
    }

    /**
     * 设置
     * @param destStation
     */
    public void setDestStation(String destStation) {
        this.destStation = destStation;
    }

    /**
     * 获取
     * @return insurance
     */
    public String getInsurance() {
        return insurance;
    }

    /**
     * 设置
     * @param insurance
     */
    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    /**
     * 获取
     * @return takeChildren
     */
    public int getTakeChildren() {
        return takeChildren;
    }

    /**
     * 设置
     * @param takeChildren
     */
    public void setTakeChildren(int takeChildren) {
        this.takeChildren = takeChildren;
    }

    /**
     * 获取
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取
     * @return orderStatus
     */
    public int getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置
     * @param orderStatus
     */
    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String toString() {
        return "OrdersList{orderId = " + orderId + ", operateTime = " + operateTime + ", departDate = " + departDate + ", departTime = " + departTime + ", ticketId = " + ticketId + ", busType = " + busType + ", checkoutId = " + checkoutId + ", ticketStatus = " + ticketStatus + ", ticketType = " + ticketType + ", ticketPrice = " + ticketPrice + ", name = " + name + ", personId = " + personId + ", telephone = " + telephone + ", seatId = " + seatId + ", departStation = " + departStation + ", destStation = " + destStation + ", insurance = " + insurance + ", takeChildren = " + takeChildren + ", userId = " + userId + ", orderStatus = " + orderStatus + "}";
    }
}
