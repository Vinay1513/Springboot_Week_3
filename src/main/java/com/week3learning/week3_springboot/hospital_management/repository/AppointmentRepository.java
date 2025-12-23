package com.week3learning.week3_springboot.hospital_management.repository;

import com.week3learning.week3_springboot.hospital_management.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}