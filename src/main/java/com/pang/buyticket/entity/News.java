package com.pang.buyticket.entity;

import java.util.Date;

/**
 * @Description 新闻咨询表
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/27 19:30
 */
public class News {

    //新闻标题
    private String newTitle;
    //新闻内容
    private String newContent;
    //新闻发布日期
    private Date newDate;
    //新闻类型
    private String newType;


    public News() {
    }

    public News(String newTitle, String newContent, Date newDate, String newType) {
        this.newTitle = newTitle;
        this.newContent = newContent;
        this.newDate = newDate;
        this.newType = newType;
    }

    /**
     * 获取
     * @return newTitle
     */
    public String getNewTitle() {
        return newTitle;
    }

    /**
     * 设置
     * @param newTitle
     */
    public void setNewTitle(String newTitle) {
        this.newTitle = newTitle;
    }

    /**
     * 获取
     * @return newContent
     */
    public String getNewContent() {
        return newContent;
    }

    /**
     * 设置
     * @param newContent
     */
    public void setNewContent(String newContent) {
        this.newContent = newContent;
    }

    /**
     * 获取
     * @return newDate
     */
    public Date getNewDate() {
        return newDate;
    }

    /**
     * 设置
     * @param newDate
     */
    public void setNewDate(Date newDate) {
        this.newDate = newDate;
    }

    /**
     * 获取
     * @return newType
     */
    public String getNewType() {
        return newType;
    }

    /**
     * 设置
     * @param newType
     */
    public void setNewType(String newType) {
        this.newType = newType;
    }

    @Override
    public String toString() {
        return "News{newTitle = " + newTitle + ", newContent = " + newContent + ", newDate = " + newDate + ", newType = " + newType + "}";
    }
}
