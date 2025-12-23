package com.week3learning.week3_springboot.collage_managment.repository;

import com.week3learning.week3_springboot.collage_managment.entity.AdmissionRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmissionRecordRepository extends JpaRepository<AdmissionRecord, Long> {
}
