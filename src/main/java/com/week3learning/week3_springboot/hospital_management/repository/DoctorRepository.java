package com.week3learning.week3_springboot.hospital_management.repository;

import com.week3learning.week3_springboot.hospital_management.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}