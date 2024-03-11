package com.example.management.service.appointmnent;

import com.example.management.dto.user.AppointmentResponseDTO;
import com.example.management.entity.appointment.Appointment;
import com.example.management.entity.hospital.Hospital;

import java.util.List;

public interface AppointmentService {

    Appointment create(AppointmentResponseDTO appointmentResponseDTO);

    List<Appointment> findAll();
}
