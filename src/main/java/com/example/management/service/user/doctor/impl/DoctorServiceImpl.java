package com.example.management.service.user.doctor.impl;

import com.example.management.dto.user.DoctorResponseDTO;
import com.example.management.entity.user.Authority;
import com.example.management.entity.user.User;
import com.example.management.entity.user.doctor.Doctor;
import com.example.management.repository.user.UserRepository;
import com.example.management.repository.user.doctor.DoctorRepository;
import com.example.management.service.user.doctor.DoctorService;
import com.example.management.service.user.user.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthorityService authorityService;

    @Override
    public List<Doctor> findALl() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor create(DoctorResponseDTO doctorResponseDTO) {
        User user = userRepository.findByUsername(doctorResponseDTO.getUsername())
                .orElseThrow(() -> new NoSuchElementException("User not found with username: "
                + doctorResponseDTO.getUsername()));
        Doctor doctor = new Doctor();
        doctor.setDoctor_name(doctorResponseDTO.getDoctor_name());
        doctor.setDoctor_mobile(doctorResponseDTO.getDoctor_mobile());
        doctor.setDoctor_specialist(doctorResponseDTO.getDoctor_specialist());
        doctor.setDoctor_email(doctorResponseDTO.getDoctor_email());
        doctor.setDoctor_address(doctorResponseDTO.getDoctor_address());

        List<Authority> authorities = authorityService.findByName("ROLE_DOCTOR");
        user.setAuthorities(authorities);

        doctor.setDoctor(user);
        doctorRepository.save(doctor);
        return doctor;
    }
}
