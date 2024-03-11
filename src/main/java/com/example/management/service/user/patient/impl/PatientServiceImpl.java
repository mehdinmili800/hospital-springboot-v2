package com.example.management.service.user.patient.impl;

import com.example.management.dto.user.PatientResponseDTO;
import com.example.management.entity.user.Authority;
import com.example.management.entity.user.User;
import com.example.management.entity.user.patient.Patient;
import com.example.management.repository.user.UserRepository;
import com.example.management.repository.user.patient.PatientRepository;
import com.example.management.service.user.patient.PatientService;
import com.example.management.service.user.user.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthorityService authorityService;
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    @Override
    public Patient create(PatientResponseDTO patientResponseDTO) {
        // Check if the user exists
        User user = userRepository.findByUsername(patientResponseDTO.getUsername())
                .orElseThrow(() -> new NoSuchElementException("User not found with username: "
                        + patientResponseDTO.getUsername()));

        Patient patient = new Patient();
        patient.setPatient_name(patientResponseDTO.getPatient_name());
        patient.setPatient_mobile(patientResponseDTO.getPatient_mobile());
        patient.setPatient_email(patientResponseDTO.getPatient_email());
        patient.setPatient_address(patientResponseDTO.getPatient_address());

        List<Authority> authorities = authorityService.findByName("ROLE_DOCTOR");
        user.setAuthorities(authorities);

        patient.setPatient(user);
        patientRepository.save(patient);

        return patient;
    }
}
