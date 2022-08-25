package com.example.redbotdemo.demo.services;

import java.util.HashSet;

import com.example.redbotdemo.demo.entities.User;

public interface UserService {

    public HashSet<User> getUsers();

    public User getUserOfName(String username);

    public boolean addUser(User user);
}
