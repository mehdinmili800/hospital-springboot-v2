package com.example.management.entity.appointment;

import com.example.management.entity.user.doctor.Doctor;
import com.example.management.entity.user.nurses.Nurses;
import com.example.management.entity.user.patient.Patient;
import jakarta.persistence.*;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "nurses_id")
    private Nurses nurses;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;



    private String appointment_number;
    private String appointment_type;
    private String appointment_date;
    private String appointment_description;

    public Appointment(Long id, Doctor doctor,Nurses nurses,Patient patient, String appointment_number,
                       String appointment_type, String appointment_date,
                       String appointment_description) {
        this.id = id;
        this.doctor = doctor;
        this.nurses = nurses;
        this.patient = patient;
        this.appointment_number = appointment_number;
        this.appointment_type = appointment_type;
        this.appointment_date = appointment_date;
        this.appointment_description = appointment_description;
    }


    public Appointment() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurses getNurses() {
        return nurses;
    }

    public void setNurses(Nurses nurses) {
        this.nurses = nurses;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getAppointment_number() {
        return appointment_number;
    }

    public void setAppointment_number(String appointment_number) {
        this.appointment_number = appointment_number;
    }

    public String getAppointment_type() {
        return appointment_type;
    }

    public void setAppointment_type(String appointment_type) {
        this.appointment_type = appointment_type;
    }

    public String getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(String appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getAppointment_description() {
        return appointment_description;
    }

    public void setAppointment_description(String appointment_description) {
        this.appointment_description = appointment_description;
    }
}
