package com.example.management.service.appointmnent;

import com.example.management.dto.user.AppointmentResponseDTO;
import com.example.management.entity.appointment.Appointment;
import com.example.management.entity.user.doctor.Doctor;

import java.util.List;

public interface AppointmentService {

    Appointment create(AppointmentResponseDTO appointmentDTO);

    List<Appointment> getAllAppointments();

}
