package com.week3learning.week3_springboot.collage_managment.service;

import com.week3learning.week3_springboot.collage_managment.entity.*;
import com.week3learning.week3_springboot.collage_managment.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final ProfessorRepository professorRepository;
    private final SubjectRepository subjectRepository;
    private final StudentProfessorRespository studentProfessorRepository;
    private final StudentSubjectRepository studentSubjectRepository;

    // Create student
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // Assign Professor to Student (Many-to-Many)
    public void assignProfessor(Long studentId, Long professorId) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow();

        Professor professor = professorRepository.findById(professorId)
                .orElseThrow();

        StudentProfessor sp = new StudentProfessor();
        sp.setStudent(student);
        sp.setProfessor(professor);

        studentProfessorRepository.save(sp);
    }

    // Assign Subject to Student (Many-to-Many)
    public void assignSubject(Long studentId, Long subjectId) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow();

        Subject subject = subjectRepository.findById(subjectId)
                .orElseThrow();

        StudentSubject ss = new StudentSubject();
        ss.setStudent(student);
        ss.setSubject(subject);

        studentSubjectRepository.save(ss);
    }
}
