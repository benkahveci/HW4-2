package com.example.hw4.controller;


import com.example.hw4.model.Course;
import com.example.hw4.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping("/courses")
    public Course addNewCourse(@RequestBody Course course){
        return courseService.addNewCourse(course);
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{id}")
    public Optional<Course> findCourseById(@PathVariable Integer id){
        return courseService.findById(id);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/courses")
    public void deleteCourse(@RequestBody Course course){
        courseService.deleteCourse(course);
    }

    @DeleteMapping("/courses/allcourses")
    public void deleteAllCourse(){
        courseService.deleteAllCourse();
    }


}
