package com.ex.service.impl;

import com.ex.dao.IDeviceDao;
import com.ex.model.Device;
import com.ex.service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * by luoqi
 * 描述
 * 日期 2018/8/11 22:28
 **/
@Service
public class DeviceServiceImpl implements IDeviceService {

    @Resource
    private IDeviceDao deviceDao;

    public Integer getCountNum() {
        return deviceDao.getCountNum();
    }

    public List<Device> findByPage(int currPage, int pageSize) {
        return deviceDao.findByPage(currPage, pageSize);
    }

    public void insertDevice(Device device) {
        deviceDao.insertDevice(device);
    }

    public void deleteById(int id) {
        deviceDao.deleteById(id);
    }

    public void updateDevice(Device device) {
        updateDevice(device);
    }

    public List<Device> findLike(String msg) {
        return deviceDao.findLike(msg);
    }
}
