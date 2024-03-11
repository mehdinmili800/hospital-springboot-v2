package com.example.management.controller.user.patient;

import com.example.management.dto.user.PatientResponseDTO;
import com.example.management.entity.user.patient.Patient;
import com.example.management.service.user.patient.impl.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class PatientController {

    @Autowired
    private PatientServiceImpl patientService;

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_PATIENT')")
    @PostMapping(value = "/patient/create")
    public Patient create(@RequestBody PatientResponseDTO patientResponseDTO){
        return patientService.create(patientResponseDTO);
    }

    @GetMapping(value = "/patients/all")
    public List<Patient> findAll(){
        return patientService.findAll();
    }


}
