package com.ex.dao;

import com.ex.model.Device;

import java.util.List;

public interface IDeviceDao {

    Integer getCountNum();

    List<Device> findByPage(int currPage, int pageSize);

    void insertDevice(Device device);

    void deleteById(int id);

    void updateDevice(Device device);

    List<Device> findLike(String msg);
}
