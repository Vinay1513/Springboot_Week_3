package com.week3learning.week3_springboot.collage_managment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String title;

    // One Professor teaches many Subjects
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Professor professor;

    // Subject ↔ Student (Many-to-Many via join entity)
    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<StudentSubject> studentSubjects = new HashSet<>();
}
