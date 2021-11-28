package com.pang.buyticket.entity;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/28 19:40
 */
public class Station {

    //车站id
    private int id;
    //车站所在城市
    private String city;
    //车站名
    private String stationName;
    //车站地址
    private String address;
    //咨询电话
    private String telephone;
    //购票方式
    private String getTicket;
    //车站图片
    private String pic;


    public Station() {
    }

    public Station(int id, String city, String stationName, String address, String telephone, String getTicket, String pic) {
        this.id = id;
        this.city = city;
        this.stationName = stationName;
        this.address = address;
        this.telephone = telephone;
        this.getTicket = getTicket;
        this.pic = pic;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取
     * @return stationName
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * 设置
     * @param stationName
     */
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
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
     * @return getTicket
     */
    public String getGetTicket() {
        return getTicket;
    }

    /**
     * 设置
     * @param getTicket
     */
    public void setGetTicket(String getTicket) {
        this.getTicket = getTicket;
    }

    /**
     * 获取
     * @return pic
     */
    public String getPic() {
        return pic;
    }

    /**
     * 设置
     * @param pic
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    public String toString() {
        return "Station{id = " + id + ", city = " + city + ", stationName = " + stationName + ", address = " + address + ", telephone = " + telephone + ", getTicket = " + getTicket + ", pic = " + pic + "}";
    }
}
