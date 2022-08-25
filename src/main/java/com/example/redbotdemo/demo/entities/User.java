package com.example.redbotdemo.demo.entities;

import java.util.HashSet;

public class User {
    private String name;
    private HashSet<Schedule> schedule;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(HashSet<Schedule> schedule) {
        this.schedule = schedule;
    }

    public User(String name, HashSet<Schedule> schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public User() {
    }

}
