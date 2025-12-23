package com.week3learning.week3_springboot.collage_managment.service;

import com.week3learning.week3_springboot.collage_managment.entity.AdmissionRecord;
import com.week3learning.week3_springboot.collage_managment.entity.Student;
import com.week3learning.week3_springboot.collage_managment.repository.AdmissionRecordRepository;
import com.week3learning.week3_springboot.collage_managment.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdmissionService {

    private final StudentRepository studentRepository;
    private final AdmissionRecordRepository admissionRecordRepository;

    public void createAdmission(Long studentId, Integer fees) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow();

        AdmissionRecord record = new AdmissionRecord();
        record.setFees(fees);
        record.setStudent(student);

        student.setAdmissionRecord(record);

        studentRepository.save(student);
    }
}
