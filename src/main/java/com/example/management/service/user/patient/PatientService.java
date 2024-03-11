package com.example.management.service.user.patient;

import com.example.management.dto.user.PatientResponseDTO;
import com.example.management.entity.user.patient.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> findAll();
    Patient create(PatientResponseDTO patientResponseDTO);
}
