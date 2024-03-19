package com.example.management.repository.appointment;

import com.example.management.entity.appointment.Appointment;
import com.example.management.entity.user.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Long> {

    List<Appointment> findByDoctorId(Long doctorId);}
