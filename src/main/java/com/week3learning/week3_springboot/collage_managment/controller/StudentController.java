package com.week3learning.week3_springboot.collage_managment.controller;

import com.week3learning.week3_springboot.collage_managment.entity.Student;
import com.week3learning.week3_springboot.collage_managment.service.AdmissionService;
import com.week3learning.week3_springboot.collage_managment.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
    private final AdmissionService admissionService;

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    // Assign professor
    @PostMapping("/{studentId}/professors/{professorId}")
    public String assignProfessor(
            @PathVariable Long studentId,
            @PathVariable Long professorId) {

        studentService.assignProfessor(studentId, professorId);
        return "Professor assigned to student";
    }

    // Assign subject
    @PostMapping("/{studentId}/subjects/{subjectId}")
    public String assignSubject(
            @PathVariable Long studentId,
            @PathVariable Long subjectId) {

        studentService.assignSubject(studentId, subjectId);
        return "Subject assigned to student";
    }

    // One-to-One admission
    @PostMapping("/{studentId}/admission")
    public String createAdmission(
            @PathVariable Long studentId,
            @RequestParam Integer fees) {

        admissionService.createAdmission(studentId, fees);
        return "Admission created";
    }
}
