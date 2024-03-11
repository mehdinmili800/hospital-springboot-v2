package com.example.management.controller.appointment_controller;

import com.example.management.dto.user.AppointmentResponseDTO;
import com.example.management.entity.appointment.Appointment;
import com.example.management.service.appointmnent.impl.AppointmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class AppointmentController {

    @Autowired
    private AppointmentServiceImpl appointmentService;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping(value = "/appointment/create")
    public Appointment create(@RequestBody AppointmentResponseDTO appointmentResponseDTO){
       return appointmentService.create(appointmentResponseDTO);
    }

    @GetMapping(value = "/appointment/all")
    public List<Appointment> findAll(){
        return appointmentService.findAll();
    }
}
