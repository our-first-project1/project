package com.pang.buyticket.entity;

/**
 * @Description 路线
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/27 20:55
 */
public class Route {

    //路线编号
    private String routeId;
    //购买热度
    private String hot;
    //起点城市
    private String routeDepartCity;
    //终点城市
    private String routeDestCity;
    //区间最低价格
    private Double routePrice;


    public Route() {
    }

    public Route(String routeId, String hot, String routeDepartCity, String routeDestCity, Double routePrice) {
        this.routeId = routeId;
        this.hot = hot;
        this.routeDepartCity = routeDepartCity;
        this.routeDestCity = routeDestCity;
        this.routePrice = routePrice;
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
     * @return hot
     */
    public String getHot() {
        return hot;
    }

    /**
     * 设置
     * @param hot
     */
    public void setHot(String hot) {
        this.hot = hot;
    }

    /**
     * 获取
     * @return routeDepartCity
     */
    public String getRouteDepartCity() {
        return routeDepartCity;
    }

    /**
     * 设置
     * @param routeDepartCity
     */
    public void setRouteDepartCity(String routeDepartCity) {
        this.routeDepartCity = routeDepartCity;
    }

    /**
     * 获取
     * @return routeDestCity
     */
    public String getRouteDestCity() {
        return routeDestCity;
    }

    /**
     * 设置
     * @param routeDestCity
     */
    public void setRouteDestCity(String routeDestCity) {
        this.routeDestCity = routeDestCity;
    }

    /**
     * 获取
     * @return routePrice
     */
    public Double getRoutePrice() {
        return routePrice;
    }

    /**
     * 设置
     * @param routePrice
     */
    public void setRoutePrice(Double routePrice) {
        this.routePrice = routePrice;
    }

    @Override
    public String toString() {
        return "Route{routeId = " + routeId + ", hot = " + hot + ", routeDepartCity = " + routeDepartCity + ", routeDestCity = " + routeDestCity + ", routePrice = " + routePrice + "}";
    }
}
