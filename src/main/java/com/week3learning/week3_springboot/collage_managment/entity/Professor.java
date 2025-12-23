package com.week3learning.week3_springboot.collage_managment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    // Professor ↔ Student (Many-to-Many)
    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<StudentProfessor> studentProfessors = new HashSet<>();

    // Professor ↔ Subject (One-to-Many)
    @OneToMany(mappedBy = "professor", cascade = CascadeType.ALL)
    private Set<Subject> subjects = new HashSet<>();
}

