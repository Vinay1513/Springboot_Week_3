package com.week3learning.week3_springboot;

;
import com.week3learning.week3_springboot.hospital_management.dto.BloodGroupStats;
import com.week3learning.week3_springboot.hospital_management.dto.CPatientInfo;
import com.week3learning.week3_springboot.hospital_management.dto.IPatientInfo;
import com.week3learning.week3_springboot.hospital_management.entity.Patient;
import com.week3learning.week3_springboot.hospital_management.repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatient() {
       // List<Patient> patientList = patientRepository.findAll();
        List<CPatientInfo> patientList = patientRepository.getAllPatientsInfoConcrete();
       // List<BloodGroupStats> patientList = patientRepository.getBloodGroupStats();

        for(var p: patientList) {
            System.out.println(p);
        }

//        int rowsAffected = patientRepository.updatePatientNameWithId("Anuj Sharma", 1L);
//
//        System.out.println(rowsAffected);

//
//        List<IPatientInfo> patients = patientRepository.getAllPatientsInfo();
//        for (IPatientInfo p : patients) {
//            System.out.println("ID: " + p.getId() + ", Name: " + p.getName() + ", Email: " + p.getEmail());
//        }
    }


}
