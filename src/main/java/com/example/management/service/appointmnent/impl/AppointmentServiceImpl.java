package com.example.management.service.appointmnent.impl;

import com.example.management.dto.user.AppointmentResponseDTO;
import com.example.management.entity.appointment.Appointment;
import com.example.management.entity.user.User;
import com.example.management.entity.user.doctor.Doctor;
import com.example.management.repository.appointment.AppointmentRepository;
import com.example.management.repository.user.doctor.DoctorRepository;
import com.example.management.service.appointmnent.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Appointment create(AppointmentResponseDTO appointmentResponseDTO) {


        Appointment appointment = new Appointment();
        appointment.setAppointment_number(appointmentResponseDTO.getAppointment_number());
        appointment.setAppointment_type(appointmentResponseDTO.getAppointment_type());
        appointment.setAppointment_date(appointmentResponseDTO.getAppointment_date());
        appointment.setAppointment_description(appointmentResponseDTO.getAppointment_description());

        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> findAll() {
        return appointmentRepository.findAll();
    }
}
