package com.week3learning.week3_springboot.collage_managment.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    // Student ↔ Professor (Many-to-Many via join entity)
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<StudentProfessor> studentProfessors = new HashSet<>();

    // Student ↔ Subject (Many-to-Many via join entity)
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<StudentSubject> studentSubjects = new HashSet<>();


    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private AdmissionRecord admissionRecord;
}


