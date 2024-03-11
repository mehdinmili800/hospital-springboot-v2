package com.example.management.service.user.doctor;

import com.example.management.dto.user.DoctorResponseDTO;
import com.example.management.entity.user.doctor.Doctor;
import com.example.management.repository.user.doctor.DoctorRepository;

import java.util.List;

public interface DoctorService {

    List<Doctor> findALl();

    Doctor create(DoctorResponseDTO doctorResponseDTO);
}
