package com.chaitanya.SpringData.controller;

import java.util.List;
import com.chaitanya.SpringData.model.Courses;
import com.chaitanya.SpringData.reposotory.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/all")
    public List<Courses> findAll(){
        return courseRepository.findAll();
    }

    @GetMapping("/{courseName}")
    public Courses findByName(@PathVariable final String courseName){
        return courseRepository.findByCourseName(courseName);
    }

    @PostMapping(value = "/load")
    public Courses load(@RequestBody Courses courses){
        courseRepository.save(courses);
        return courseRepository.findByCourseName(courses.getCourseName());
    }

}
