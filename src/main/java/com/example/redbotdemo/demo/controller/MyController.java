package com.example.redbotdemo.demo.controller;

import java.util.HashSet;
import com.example.redbotdemo.demo.entities.User;
import com.example.redbotdemo.demo.services.UserService;

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
    private UserService userService;

    @GetMapping("/users")
    public HashSet<User> getUsers() {
        return this.userService.getUsers();
    }

    @GetMapping("/users/{username}")
    public User getCourseId(@PathVariable("username") String deviceID) {
        return this.userService.getUserOfName(deviceID);
    }

    @PostMapping("/user")
    public boolean addCourse(@RequestBody User user) {
        return this.userService.addUser(user);
    }
}