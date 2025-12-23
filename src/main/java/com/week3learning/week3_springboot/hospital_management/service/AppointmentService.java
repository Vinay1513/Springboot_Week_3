package com.week3learning.week3_springboot.hospital_management.service;

import com.week3learning.week3_springboot.hospital_management.entity.Appointment;
import com.week3learning.week3_springboot.hospital_management.entity.Doctor;
import com.week3learning.week3_springboot.hospital_management.entity.Patient;
import com.week3learning.week3_springboot.hospital_management.repository.AppointmentRepository;
import com.week3learning.week3_springboot.hospital_management.repository.DoctorRepository;
import com.week3learning.week3_springboot.hospital_management.repository.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;

    @Transactional
    public Appointment createANewAppointment(Appointment appointment, Long patientId, Long doctorId) {
        Patient patient = patientRepository.findById(patientId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        appointmentRepository.save(appointment);

        return appointment;
    }


}
