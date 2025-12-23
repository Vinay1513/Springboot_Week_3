package com.week3learning.week3_springboot.collage_managment.repository;

import com.week3learning.week3_springboot.collage_managment.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
