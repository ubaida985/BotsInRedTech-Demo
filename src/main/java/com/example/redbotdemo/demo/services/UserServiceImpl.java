package com.example.redbotdemo.demo.services;

import java.util.HashSet;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.redbotdemo.demo.entities.Dose;
import com.example.redbotdemo.demo.entities.Schedule;
import com.example.redbotdemo.demo.entities.User;

@Service
public class UserServiceImpl implements UserService {

    HashSet<Schedule> schedules;
    HashSet<Dose> dosesOne;
    HashSet<User> users;

    public UserServiceImpl() {

        users = new HashSet<>();
        schedules = new HashSet<>();
        dosesOne = new HashSet<>();

        // filling data for user one
        dosesOne.add(new Dose(0, 5));
        dosesOne.add(new Dose(1, 4));
        dosesOne.add(new Dose(2, 3));
        dosesOne.add(new Dose(3, 2));
        dosesOne.add(new Dose(4, 1));
        dosesOne.add(new Dose(5, 1));

        schedules.add(new Schedule("2022-08-08T15:09:21.687Z", dosesOne));
        schedules.add(new Schedule("2022-08-08T11:29:21.687Z", dosesOne));

        users.add(new User("UserOne", schedules));

        // filling data for user two
        dosesOne.clear();
        dosesOne.add(new Dose(0, 5));
        dosesOne.add(new Dose(1, 4));
        dosesOne.add(new Dose(2, 3));
        dosesOne.add(new Dose(3, 2));
        dosesOne.add(new Dose(4, 2));
        dosesOne.add(new Dose(5, 2));

        schedules.add(new Schedule("2022-08-08T15:09:21.687Z", dosesOne));
        schedules.add(new Schedule("2022-08-08T11:29:21.687Z", dosesOne));

        users.add(new User("UserTwo", schedules));

    }

    @Override
    public HashSet<User> getUsers() {
        return users;
    }

    @Override
    public User getUserOfName(String username) {
        for (User x : users) {
            if (x.getName().equals(username)) {
                return x;
            }
        }

        return null;
    }

    @Override
    public boolean addUser(User user) {
        users.add(user);
        return true;
    }

}
