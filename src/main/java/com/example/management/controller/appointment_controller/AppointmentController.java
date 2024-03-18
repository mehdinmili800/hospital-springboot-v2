package com.example.management.controller.appointment_controller;

import com.example.management.dto.user.AppointmentResponseDTO;
import com.example.management.entity.appointment.Appointment;
import com.example.management.entity.hospital.Hospital;
import com.example.management.entity.user.doctor.Doctor;
import com.example.management.service.appointmnent.impl.AppointmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class AppointmentController {

    @Autowired
    private AppointmentServiceImpl appointmentService;

    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_EMPLOYEE')")
    @PostMapping(value = "/appointment/create")
    public Appointment create(@RequestBody AppointmentResponseDTO appointmentResponseDTO){
        return appointmentService.create(appointmentResponseDTO);
    }


    @GetMapping("/appointment/all")
    public ResponseEntity<List<Appointment>> getAllAppointments() {
        List<Appointment> appointments = appointmentService.getAllAppointments();
        return ResponseEntity.ok(appointments);
    }

}
