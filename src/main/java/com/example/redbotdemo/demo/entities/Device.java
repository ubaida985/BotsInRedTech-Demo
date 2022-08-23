package com.example.redbotdemo.demo.entities;

import java.util.HashSet;
import java.util.Objects;

public class Device {
    private long deviceID;
    private HashSet<User> users;

    public Device(long deviceID, HashSet<User> users) {
        this.deviceID = deviceID;
        this.users = users;
    }

    public long getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(long deviceID) {
        this.deviceID = deviceID;
    }

    public HashSet<User> getUsers() {
        return users;
    }

    public void setUsers(HashSet<User> users) {
        this.users = users;
    }

    public Device() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (deviceID ^ (deviceID >>> 32));
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

    @Override
    public String toString() {
        return "Device [deviceID=" + deviceID + ", users=" + users + "]";
    }

}
