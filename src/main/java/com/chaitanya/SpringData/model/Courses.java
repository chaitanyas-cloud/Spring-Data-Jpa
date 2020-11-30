package com.chaitanya.SpringData.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Courses {

    private Integer courseId;
    private String courseName;
    private Integer couseFee;

    @Id
    @GeneratedValue
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCouseFee() {
        return couseFee;
    }

    public void setCouseFee(Integer couseFee) {
        this.couseFee = couseFee;
    }
}
