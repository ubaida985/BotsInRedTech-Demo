package com.example.redbotdemo.demo.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.redbotdemo.demo.entities.Device;
import com.example.redbotdemo.demo.entities.Dose;
import com.example.redbotdemo.demo.entities.Schedule;
import com.example.redbotdemo.demo.entities.User;

@Service
public class DeviceServiceImpl implements DeviceService {

    HashSet<Device> devices;
    List<User> users;
    HashSet<Schedule> schedules;
    HashSet<Dose> doses;

    DeviceServiceImpl() {
        // initializing the class variables
        devices = new HashSet<>();
        users = new ArrayList<>();
        schedules = new HashSet<>();
        doses = new HashSet<>();

        // injecting values
        // inject devices
        setDevices();

    }

    @Override
    public HashSet<Device> getDevices() {
        return devices;
    }

    @Override
    public Device getDeviceOfID(int deviceID) {

        for (Device x : devices) {
            if (x.getDeviceID() == deviceID) {
                return x;
            }
        }

        return null;
    }

    @Override
    public List<User> getUserOfDevice(int deviceID) {

        for (Device x : devices) {
            if (x.getDeviceID() == deviceID) {
                return x.getUsers();
            }
        }

        return null;
    }

    @Override
    public boolean addDevice(Device device) {
        if (devices.add(device))
            return true;
        return false;
    }

    public void setDevices() {
        setUsers();

        devices.add(new Device(1, users));
        devices.add(new Device(2, users));
        devices.add(new Device(3, users));
    }

    public void setUsers() {
        setSchedules();
        users.add(new User("UserOne", schedules));

        users.add(new User("UserTwo", schedules));
    }

    public void setSchedules() {
        setDoses();
        schedules.add(new Schedule("2022-08-08T15:09:21.687Z", doses));
        setDoses();
        schedules.add(new Schedule("2021-10-08T15:09:21.687Z", doses));
    }

    public void setDoses() {
        doses.clear();
        Random random = new Random();
        doses.add(new Dose(0, random.nextInt(10)));
        doses.add(new Dose(1, random.nextInt(10)));
        doses.add(new Dose(2, random.nextInt(10)));
        doses.add(new Dose(3, random.nextInt(10)));
        doses.add(new Dose(4, random.nextInt(10)));
        doses.add(new Dose(5, random.nextInt(10)));
    }

    @Override
    public boolean addUser(int deviceID, User user) {
        for (Device x : devices) {
            if (x.getDeviceID() == deviceID) {
                List<User> ans = x.getUsers();
                ans.add(user);
                x.setUsers(ans);
                return true;
            }
        }
        return false;
    }

}
