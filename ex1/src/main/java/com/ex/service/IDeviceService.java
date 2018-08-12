package com.ex.service;

import com.ex.model.Device;

import java.util.List;

public interface IDeviceService {

    public Integer getCountNum();

    public List<Device> findByPage(int currPage, int pageSize);

    public void insertDevice(Device device);

    public void deleteById(int id);

    public void updateDevice(Device device);

    public List<Device> findLike(String msg);
}
