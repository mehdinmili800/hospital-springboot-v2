package com.example.management.repository.user.doctor;

import com.example.management.entity.user.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {

    Optional<Doctor> findByDoctorName(String doctorName);
}
