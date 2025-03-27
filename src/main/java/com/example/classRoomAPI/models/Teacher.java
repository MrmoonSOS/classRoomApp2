package com.example.classRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
public class Teacher {
    private Integer id;
    private String Speciality;

    //creating relationships between teacher and course (One to many)
    @OneToMany(mappedBy = "teacher")
    @JsonManagedReference
    private List<Course> courses;

    public Teacher() {
    }

    public Teacher(Integer id, String speciality) {
        this.id = id;
        Speciality = speciality;
    }

    public Integer getIdTeacher() {
        return id;
    }

    public void setIdTeacher(Integer id) {
        this.id = id;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }
}
