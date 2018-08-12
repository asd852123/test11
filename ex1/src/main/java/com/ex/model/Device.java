package com.ex.model;

/**
 * by luoqi
 * 描述
 * 日期 2018/8/11 21:42
 **/
public class Device {

    private Integer id;
    private String device_name;
    private String device_ip;
    private String device_user;
    private String device_password;
    private String creater;
    private String updater;
    private String create_time; //varchar(45)
    private String update_time; //varchar(45)
    private Integer device_port; //int(11)
    private Integer device_state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }

    public String getDevice_ip() {
        return device_ip;
    }

    public void setDevice_ip(String device_ip) {
        this.device_ip = device_ip;
    }

    public String getDevice_user() {
        return device_user;
    }

    public void setDevice_user(String device_user) {
        this.device_user = device_user;
    }

    public String getDevice_password() {
        return device_password;
    }

    public void setDevice_password(String device_password) {
        this.device_password = device_password;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Integer getDevice_port() {
        return device_port;
    }

    public void setDevice_port(Integer device_port) {
        this.device_port = device_port;
    }

    public Integer getDevice_state() {
        return device_state;
    }

    public void setDevice_state(Integer device_state) {
        this.device_state = device_state;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", device_name='" + device_name + '\'' +
                ", device_ip='" + device_ip + '\'' +
                ", device_user='" + device_user + '\'' +
                ", device_password='" + device_password + '\'' +
                ", creater='" + creater + '\'' +
                ", updater='" + updater + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", device_port=" + device_port +
                ", device_state=" + device_state +
                '}';
    }
}
