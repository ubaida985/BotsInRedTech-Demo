package com.example.redbotdemo.demo.services;

import java.util.HashSet;
import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.example.redbotdemo.demo.entities.Device;
import com.example.redbotdemo.demo.entities.Dose;
import com.example.redbotdemo.demo.entities.Time;
import com.example.redbotdemo.demo.entities.User;

@Service
public class DeviceServiceImpl implements DeviceService {

    HashSet<Device> devices;
    HashSet<Time> times;
    HashSet<Dose> dosesOne, dosesTwo;
    HashSet<User> users;

    public DeviceServiceImpl() {
        devices = new HashSet<>();

        users = new HashSet<>();
        times = new HashSet<>();
        dosesOne = new HashSet<>();
        dosesTwo = new HashSet<>();

        // device ONE users
        // filling data for user one
        dosesOne.add(new Dose("DoseOneOne", 5));
        dosesOne.add(new Dose("DoseTwoOne", 4));
        dosesOne.add(new Dose("DoseThreeOne", 3));
        dosesOne.add(new Dose("DoseFourOne", 2));
        dosesOne.add(new Dose("DoseFiveOne", 1));

        dosesTwo.add(new Dose("DoseTwoTwo", 4));
        dosesTwo.add(new Dose("DoseThreeTwo", 3));
        dosesTwo.add(new Dose("DoseFourTwo", 2));
        dosesTwo.add(new Dose("DoseFiveTwo", 1));

        times.add(new Time("01:00:00", dosesOne));
        times.add(new Time("02:00:00", dosesTwo));

        users.add(new User("ExampleOne", "exampleOne@gmail.com", "passwordExample", times));

        // filling data for user two
        dosesOne.clear();
        dosesOne.add(new Dose("DoseOneThree", 5));
        dosesOne.add(new Dose("DoseTwoThree", 4));
        dosesOne.add(new Dose("DoseThreeThree", 3));
        dosesOne.add(new Dose("DoseFourThree", 2));
        dosesOne.add(new Dose("DoseFiveThree", 1));

        dosesTwo.clear();
        dosesTwo.add(new Dose("DoseTwoEightFour", 4));
        dosesTwo.add(new Dose("DoseThreeEightFour", 3));
        dosesTwo.add(new Dose("DoseFourEightFour", 2));
        dosesTwo.add(new Dose("DoseFiveEightFour", 1));

        times.clear();
        times.add(new Time("03:00:00", dosesOne));
        times.add(new Time("04:00:00", dosesTwo));
        users.add(new User("ExampleTwo", "exampleTwo@gmail.com", "passwordExample", times));

        // adding device one
        devices.add(new Device(12345432l, users));

        // device two users
        // filling data for user one
        dosesOne.clear();
        dosesOne.add(new Dose("DoseOneFive", 5));
        dosesOne.add(new Dose("DoseTwoFive", 4));
        dosesOne.add(new Dose("DoseThreeFive", 3));
        dosesOne.add(new Dose("DoseFourFive", 2));
        dosesOne.add(new Dose("DoseFiveFive", 1));

        dosesTwo.clear();
        dosesTwo.add(new Dose("DoseTwoSix", 4));
        dosesTwo.add(new Dose("DoseThreeSix", 3));
        dosesTwo.add(new Dose("DoseFourSix", 2));
        dosesTwo.add(new Dose("DoseFiveSix", 1));

        times.add(new Time("05:00:00", dosesOne));
        times.add(new Time("06:00:00", dosesTwo));

        users.add(new User("ExampleOne", "exampleOne@gmail.com", "passwordExample", times));

        // filling data for user two
        dosesOne.clear();
        dosesOne.add(new Dose("DoseOneSeven", 5));
        dosesOne.add(new Dose("DoseTwoSeven", 4));
        dosesOne.add(new Dose("DoseThreeSeven", 3));
        dosesOne.add(new Dose("DoseFourSeven", 2));
        dosesOne.add(new Dose("DoseFiveSeven", 1));

        dosesTwo.clear();
        dosesTwo.add(new Dose("DoseTwoEightEight", 4));
        dosesTwo.add(new Dose("DoseThreeEightEight", 3));
        dosesTwo.add(new Dose("DoseFourEightEight", 2));
        dosesTwo.add(new Dose("DoseFiveEightEight", 1));

        times.clear();
        times.add(new Time("07:00:00", dosesOne));
        times.add(new Time("08:00:00", dosesTwo));
        users.add(new User("ExampleTwo", "exampleTwo@gmail.com", "passwordExample", times));

        // adding device two
        devices.add(new Device(987654789l, users));
    }

    @Override
    public HashSet<Device> getDevices() {
        return devices;
    }

    @Override
    public Device getDeviceID(long deviceID) {
        for (Device x : devices) {
            if (x.getDeviceID() == deviceID) {
                return x;
            }
        }

        return null;
    }

    @Override
    public boolean addDevice(Device device) {
        devices.add(device);
        return true;
    }

}
