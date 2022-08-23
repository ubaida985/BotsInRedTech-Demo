package com.example.redbotdemo.demo.entities;

import java.util.HashSet;

public class User {
    private String name, email, password;
    private HashSet<Time> times;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
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
        User other = (User) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        return true;
    }

    public User() {
    }

    public User(String name, String email, String password, HashSet<Time> times) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.times = times;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HashSet<Time> getTimes() {
        return this.times;
    }

    public void setTimes(HashSet<Time> times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", email='" + getEmail() + "'" +
                ", password='" + getPassword() + "'" +
                ", times='" + getTimes() + "'" +
                "}";
    }

}
