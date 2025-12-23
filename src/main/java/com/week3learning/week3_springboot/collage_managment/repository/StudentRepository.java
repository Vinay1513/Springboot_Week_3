package com.week3learning.week3_springboot.collage_managment.repository;

import com.week3learning.week3_springboot.collage_managment.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {



}
