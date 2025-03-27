package com.example.classRoomAPI.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private Integer id;

    @Column(name = "name", length = 100, unique = false, nullable = false)
    private String name;

    //creating relationships between course and teacher (many to one)
    @ManyToOne
    @JoinColumn(name = "FK_teacher", referencedColumnName = "id")
    @JsonBackReference
    private Teacher teacher;


    public Course() {
    }

    public Course(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Integer getIdCourse() {
        return id;
    }

    public void setIdCourse(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
