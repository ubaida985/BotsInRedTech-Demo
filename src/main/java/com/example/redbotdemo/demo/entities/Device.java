package com.example.redbotdemo.demo.entities;

import java.util.List;

public class Device {
    private int deviceID;
    List<User> users;

    public Device(int deviceID, List<User> users) {
        this.deviceID = deviceID;
        this.users = users;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + deviceID;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Device other = (Device) obj;
        if (deviceID != other.deviceID)
            return false;
        return true;
    }

}
