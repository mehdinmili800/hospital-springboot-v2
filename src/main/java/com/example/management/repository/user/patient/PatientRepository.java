package com.example.management.repository.user.patient;

import com.example.management.entity.user.User;
import com.example.management.entity.user.patient.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {

    Optional<Patient> findByPatientName(String patientName);

}
