package com.example.redbotdemo.demo.controller;

import java.util.HashSet;
import com.example.redbotdemo.demo.entities.Device;
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
    public Device getCourseId(@PathVariable("deviceID") String deviceID) {
        return this.deviceService.getDeviceID(Long.parseLong(deviceID));
    }

    @PostMapping("/devices")
    public boolean addCourse(@RequestBody Device device) {
        return this.deviceService.addDevice(device);
    }
}