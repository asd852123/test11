package com.ex.model;

/**
 * by luoqi
 * 描述
 * 日期 2018/8/9 18:16
 **/
public class User {

    private Integer id;
    private String account;
    private String password;
    private String name;
    private String sex;
    private String type;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", account=" + account + ", password=" + password + ", name=" + name + ", sex=" + sex
                + ", type=" + type + "]";
    }



}