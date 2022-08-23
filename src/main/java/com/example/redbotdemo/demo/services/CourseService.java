package com.example.redbotdemo.demo.services;

import java.util.List;
import com.example.redbotdemo.demo.entities.Course;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourseId(long courseId);

    public boolean addCourse(Course course);
}
