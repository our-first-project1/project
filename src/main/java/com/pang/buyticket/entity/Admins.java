package com.pang.buyticket.entity;

/**
 * @Description 管理员信息
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/27 19:18
 */
public class Admins {

    //管理员账号
    private Long adminId;
    //管理员姓名
    private String adminName;
    //登录密码
    private String adminPassword;
    //账号类型
    private String adminType;
    //身份证号码
    private Long adminPersonId;
    //工作岗位（职位）
    private String adminPosition;
    //权限等级
    private String adminPriviliage;
    //联系方式
    private String adminTelephone;


    public Admins() {
    }

    public Admins(Long adminId, String adminName, String adminPassword, String adminType, Long adminPersonId, String adminPosition, String adminPriviliage, String adminTelephone) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
        this.adminType = adminType;
        this.adminPersonId = adminPersonId;
        this.adminPosition = adminPosition;
        this.adminPriviliage = adminPriviliage;
        this.adminTelephone = adminTelephone;
    }

    /**
     * 获取
     * @return adminId
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * 设置
     * @param adminId
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取
     * @return adminName
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 设置
     * @param adminName
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    /**
     * 获取
     * @return adminPassword
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * 设置
     * @param adminPassword
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    /**
     * 获取
     * @return adminType
     */
    public String getAdminType() {
        return adminType;
    }

    /**
     * 设置
     * @param adminType
     */
    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }

    /**
     * 获取
     * @return adminPersonId
     */
    public Long getAdminPersonId() {
        return adminPersonId;
    }

    /**
     * 设置
     * @param adminPersonId
     */
    public void setAdminPersonId(Long adminPersonId) {
        this.adminPersonId = adminPersonId;
    }

    /**
     * 获取
     * @return adminPosition
     */
    public String getAdminPosition() {
        return adminPosition;
    }

    /**
     * 设置
     * @param adminPosition
     */
    public void setAdminPosition(String adminPosition) {
        this.adminPosition = adminPosition;
    }

    /**
     * 获取
     * @return adminPriviliage
     */
    public String getAdminPriviliage() {
        return adminPriviliage;
    }

    /**
     * 设置
     * @param adminPriviliage
     */
    public void setAdminPriviliage(String adminPriviliage) {
        this.adminPriviliage = adminPriviliage;
    }

    /**
     * 获取
     * @return adminTelephone
     */
    public String getAdminTelephone() {
        return adminTelephone;
    }

    /**
     * 设置
     * @param adminTelephone
     */
    public void setAdminTelephone(String adminTelephone) {
        this.adminTelephone = adminTelephone;
    }

    @Override
    public String toString() {
        return "Admins{adminId = " + adminId + ", adminName = " + adminName + ", adminPassword = " + adminPassword + ", adminType = " + adminType + ", adminPersonId = " + adminPersonId + ", adminPosition = " + adminPosition + ", adminPriviliage = " + adminPriviliage + ", adminTelephone = " + adminTelephone + "}";
    }
}
