package com.week3learning.week3_springboot.collage_managment.repository;

import com.week3learning.week3_springboot.collage_managment.entity.StudentProfessor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfessorRespository extends JpaRepository<StudentProfessor, Long> {
}
