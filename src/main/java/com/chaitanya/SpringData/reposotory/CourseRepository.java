package com.chaitanya.SpringData.reposotory;

import com.chaitanya.SpringData.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CourseRepository extends JpaRepository<Courses, Integer> {
    Courses findByCourseName(String courseName);
}
