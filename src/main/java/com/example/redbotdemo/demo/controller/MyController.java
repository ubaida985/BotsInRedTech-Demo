package com.example.redbotdemo.demo.controller;

import com.example.redbotdemo.demo.entities.Device;
import java.util.HashSet;
import java.util.List;

import com.example.redbotdemo.demo.entities.User;
import com.example.redbotdemo.demo.services.DeviceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@ComponentScan("com.example.redbotdemo.demo")
@RestController
public class MyController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping("/devices")
    public HashSet<Device> getDevices() {
        return this.deviceService.getDevices();
    }

    @GetMapping("/devices/{deviceID}")
    public Device getDevice(@PathVariable("deviceID") String deviceID) {
        return this.deviceService.getDeviceOfID(Integer.parseInt(deviceID));
    }

    @GetMapping("/devices/{deviceID}/users")
    public List<User> getUsers(@PathVariable("deviceID") String deviceID) {
        return this.deviceService.getUserOfDevice(Integer.parseInt(deviceID));
    }

    @PostMapping("/devices")
    public boolean addDevice(@RequestBody Device device) {
        return this.deviceService.addDevice(device);
    }

    @PostMapping("/devices/{deviceID}/user")
    public boolean addUser(@PathVariable("deviceID") String deviceID, @RequestBody User user) {
        return this.deviceService.addUser(Integer.parseInt(deviceID), user);
    }
}