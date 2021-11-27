package com.pang.buyticket.entity;

import java.util.Date;

/**
 * @Description TODO
 * @Login DREAM
 * @Author JF
 * @Date 2021/11/26 10:34
 */
public class User {
    //用户编号
    private String uid;
    //用户的昵称
    private String username;
    //用户密码
    private String password;
    //用户姓名
    private String name;
    //用户身份证号
    private Long personId;
    //用户电子邮箱
    private String email;
    //用户电话号码
    private String telephone;
    //用户出生日期
    private Date birthday;
    //用户性别
    private String sex;
    //用户头像
    private String uimage;


    public User() {
    }

    public User(String uid, String username, String password, String name, Long personId, String email, String telephone, Date birthday, String sex, String uimage) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.name = name;
        this.personId = personId;
        this.email = email;
        this.telephone = telephone;
        this.birthday = birthday;
        this.sex = sex;
        this.uimage = uimage;
    }

    /**
     * 获取
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * 设置
     * @param uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
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
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return uimage
     */
    public String getUimage() {
        return uimage;
    }

    /**
     * 设置
     * @param uimage
     */
    public void setUimage(String uimage) {
        this.uimage = uimage;
    }

    @Override
    public String toString() {
        return "User{uid = " + uid + ", username = " + username + ", password = " + password + ", name = " + name + ", personId = " + personId + ", email = " + email + ", telephone = " + telephone + ", birthday = " + birthday + ", sex = " + sex + ", uimage = " + uimage + "}";
    }
}
