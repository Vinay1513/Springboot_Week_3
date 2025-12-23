package com.week3learning.week3_springboot.hospital_management.repository;

import com.week3learning.week3_springboot.hospital_management.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}