package com.week3learning.week3_springboot.collage_managment.repository;

import com.week3learning.week3_springboot.collage_managment.entity.Professor;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface ProfessorRepository extends JpaRepositoryImplementation<Professor, Long> {
}
