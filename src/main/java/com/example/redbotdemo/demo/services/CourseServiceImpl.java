package com.example.redbotdemo.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.redbotdemo.demo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(145, "JavaCourse", "this course contains all you need to know about Java"));
        list.add(new Course(123, "SpringBoot", "this course contains all you need to know about spring boot"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourseId(long courseId) {
        for (Course x : list) {
            if (x.getId() == courseId) {
                return x;
            }
        }

        return null;
    }

    @Override
    public boolean addCourse(Course course) {
        list.add(course);
        return true;
    }
}
