package com.week3learning.week3_springboot.collage_managment.repository;

import com.week3learning.week3_springboot.collage_managment.entity.StudentSubject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentSubjectRepository extends JpaRepository<StudentSubject, Long> {
}
