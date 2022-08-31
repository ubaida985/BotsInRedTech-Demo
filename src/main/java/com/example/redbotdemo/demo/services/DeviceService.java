package com.example.redbotdemo.demo.services;

import java.util.HashSet;
import java.util.List;

import com.example.redbotdemo.demo.entities.Device;
import com.example.redbotdemo.demo.entities.User;

public interface DeviceService {

    public HashSet<Device> getDevices();

    public Device getDeviceOfID(int deviceID);

    public List<User> getUserOfDevice(int deviceID);

    public boolean addDevice(Device device);

    public boolean addUser(int deviceID, User user);
}
