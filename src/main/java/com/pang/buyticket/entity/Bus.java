package com.pang.buyticket.entity;

/**
 * @Description 车辆信息
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/27 18:33
 */
public class Bus {

    //汽车编号
    private String busId;
    //汽车类型
    private String busType;
    //班车时间
    private String departTime;
    //车牌号
    private String busBrand;
    //核载人数
    private Long seatCounts;
    //起始站
    private String departStation;
    //终点站
    private String destStation;

    public Bus() {
    }

    public Bus(String busId, String busType, String departTime, String busBrand, Long seatCounts, String departStation, String destStation) {
        this.busId = busId;
        this.busType = busType;
        this.departTime = departTime;
        this.busBrand = busBrand;
        this.seatCounts = seatCounts;
        this.departStation = departStation;
        this.destStation = destStation;
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
     * @return busBrand
     */
    public String getBusBrand() {
        return busBrand;
    }

    /**
     * 设置
     * @param busBrand
     */
    public void setBusBrand(String busBrand) {
        this.busBrand = busBrand;
    }

    /**
     * 获取
     * @return seatCounts
     */
    public Long getSeatCounts() {
        return seatCounts;
    }

    /**
     * 设置
     * @param seatCounts
     */
    public void setSeatCounts(Long seatCounts) {
        this.seatCounts = seatCounts;
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

    @Override
    public String toString() {
        return "Bus{busId = " + busId + ", busType = " + busType + ", departTime = " + departTime + ", busBrand = " + busBrand + ", seatCounts = " + seatCounts + ", departStation = " + departStation + ", destStation = " + destStation + "}";
    }
}
