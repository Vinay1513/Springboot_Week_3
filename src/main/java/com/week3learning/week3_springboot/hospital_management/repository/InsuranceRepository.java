package com.week3learning.week3_springboot.hospital_management.repository;

import com.week3learning.week3_springboot.hospital_management.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}