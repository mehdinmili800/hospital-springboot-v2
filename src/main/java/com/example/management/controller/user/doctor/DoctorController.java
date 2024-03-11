package com.example.management.controller.user.doctor;

import com.example.management.dto.user.DoctorResponseDTO;
import com.example.management.entity.user.doctor.Doctor;
import com.example.management.service.user.doctor.impl.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class DoctorController {

    @Autowired
    private DoctorServiceImpl doctorService;

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_DOCTOR')")
    @PostMapping(value = "/doctor/create")
    public Doctor create(@RequestBody DoctorResponseDTO doctorResponseDTO){
        return doctorService.create(doctorResponseDTO);
    }

    @GetMapping(value = "/doctors/all")
    public List<Doctor> findAll(){
        return doctorService.findALl();
    }
}
