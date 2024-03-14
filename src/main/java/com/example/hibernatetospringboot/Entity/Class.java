package com.example.hibernatetospringboot.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;

    @ManyToMany(mappedBy = "classes")
    private List<Student> students;

    public Class() {
    }

    public Class(Long id, String title, String description, List<Student> students) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
