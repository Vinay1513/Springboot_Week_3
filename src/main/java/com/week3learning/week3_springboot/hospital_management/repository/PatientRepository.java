package com.week3learning.week3_springboot.hospital_management.repository;

import com.week3learning.week3_springboot.hospital_management.dto.BloodGroupStats;
import com.week3learning.week3_springboot.hospital_management.dto.CPatientInfo;
import com.week3learning.week3_springboot.hospital_management.dto.IPatientInfo;
import com.week3learning.week3_springboot.hospital_management.entity.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    // ✅ Interface-based projection (BEST for read-only)
    @Query("select p.id as id, p.name as name, p.email as email from Patient p")
    List<IPatientInfo> getAllPatientsInfo();

    // ✅ DTO (record) projection — FIXED package
    @Query("""
        select new com.week3learning.week3_springboot.hospital_management.dto.CPatientInfo(
            p.id,
            p.name
        )
        from Patient p
    """)
    List<CPatientInfo> getAllPatientsInfoConcrete();

    // ✅ Aggregation DTO — FIXED package
    @Query("""
        select new com.week3learning.week3_springboot.hospital_management.dto.BloodGroupStats(
            p.bloodGroup,
            COUNT(p)
        )
        from Patient p
        group by p.bloodGroup
        order by COUNT(p) DESC
    """)
    List<BloodGroupStats> getBloodGroupStats();

    // ✅ Update query
    @Transactional
    @Modifying
    @Query("UPDATE Patient p set p.name = :name where p.id = :id")
    int updatePatientNameWithId(@Param("name") String name, @Param("id") Long id);

    // ✅ Fetch join to avoid N+1 problem
    @Query("select p from Patient p LEFT JOIN FETCH p.appointments")
    List<Patient> getAllPatientsWithAppointments();
}
