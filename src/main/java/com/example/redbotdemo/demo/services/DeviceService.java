package com.example.redbotdemo.demo.services;

import java.util.HashSet;

import com.example.redbotdemo.demo.entities.Device;

public interface DeviceService {

    public HashSet<Device> getDevices();

    public Device getDeviceID(long deviceID);

    public boolean addDevice(Device device);
}
