package com.example.management.entity.user.patient;

import com.example.management.entity.appointment.Appointment;
import com.example.management.entity.user.User;
import com.example.management.entity.user.doctor.Doctor;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private User patient;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Appointment> appointments;


    private String patient_name;
    private String patient_mobile;
    private String patient_email;
    private String patient_address;




    public Patient(User patient, String patient_name,
                   String patient_mobile, String patient_email, String patient_address) {
        this.patient = patient;
        this.patient_name = patient_name;
        this.patient_mobile = patient_mobile;
        this.patient_email = patient_email;
        this.patient_address = patient_address;
    }

    public Patient() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        this.patient = patient;
    }



    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_mobile() {
        return patient_mobile;
    }

    public void setPatient_mobile(String patient_mobile) {
        this.patient_mobile = patient_mobile;
    }

    public String getPatient_email() {
        return patient_email;
    }

    public void setPatient_email(String patient_email) {
        this.patient_email = patient_email;
    }

    public String getPatient_address() {
        return patient_address;
    }

    public void setPatient_address(String patient_address) {
        this.patient_address = patient_address;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
