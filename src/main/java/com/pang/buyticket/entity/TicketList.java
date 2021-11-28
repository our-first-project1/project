package com.pang.buyticket.entity;

/**
 * @Description 车次信息表
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/27 21:02
 */
public class TicketList {
    //车次编号
    private String ticketId;
    //出发日期编号
    private int departDateId;
    //班车时间
    private String departTime;
    //出发城市
    private String departCity;
    //起始站
    private String departStation;
    //终点城市
    private String destCity;
    //终点站
    private String destStation;
    //汽车类型
    private String busType;
    //票价
    private Double ticketPrice;
    //剩余票数
    private int ticketCounts;
    //车票状态（运营/停售）
    private String ticketStatus;
    //对应的路线编号
    private String routeId;
    //班车编号
    private String busId;


    public TicketList() {
    }

    public TicketList(String ticketId, int departDateId, String departTime, String departCity, String departStation, String destCity, String destStation, String busType, Double ticketPrice, int ticketCounts, String ticketStatus, String routeId, String busId) {
        this.ticketId = ticketId;
        this.departDateId = departDateId;
        this.departTime = departTime;
        this.departCity = departCity;
        this.departStation = departStation;
        this.destCity = destCity;
        this.destStation = destStation;
        this.busType = busType;
        this.ticketPrice = ticketPrice;
        this.ticketCounts = ticketCounts;
        this.ticketStatus = ticketStatus;
        this.routeId = routeId;
        this.busId = busId;
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
     * @return departDateId
     */
    public int getDepartDateId() {
        return departDateId;
    }

    /**
     * 设置
     * @param departDateId
     */
    public void setDepartDateId(int departDateId) {
        this.departDateId = departDateId;
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
     * @return departCity
     */
    public String getDepartCity() {
        return departCity;
    }

    /**
     * 设置
     * @param departCity
     */
    public void setDepartCity(String departCity) {
        this.departCity = departCity;
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
     * @return destCity
     */
    public String getDestCity() {
        return destCity;
    }

    /**
     * 设置
     * @param destCity
     */
    public void setDestCity(String destCity) {
        this.destCity = destCity;
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
     * @return ticketCounts
     */
    public int getTicketCounts() {
        return ticketCounts;
    }

    /**
     * 设置
     * @param ticketCounts
     */
    public void setTicketCounts(int ticketCounts) {
        this.ticketCounts = ticketCounts;
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
     * @return routeId
     */
    public String getRouteId() {
        return routeId;
    }

    /**
     * 设置
     * @param routeId
     */
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * 获取
     * @return busId
     */
    public String getBusId() {
        return busId;
    }

    /**
     * 设置
     * @param busId
     */
    public void setBusId(String busId) {
        this.busId = busId;
    }

    @Override
    public String toString() {
        return "TicketList{ticketId = " + ticketId + ", departDateId = " + departDateId + ", departTime = " + departTime + ", departCity = " + departCity + ", departStation = " + departStation + ", destCity = " + destCity + ", destStation = " + destStation + ", busType = " + busType + ", ticketPrice = " + ticketPrice + ", ticketCounts = " + ticketCounts + ", ticketStatus = " + ticketStatus + ", routeId = " + routeId + ", busId = " + busId + "}";
    }
}
