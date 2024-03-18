package com.example.management.entity.user.doctor;

import com.example.management.entity.appointment.Appointment;
import com.example.management.entity.treatment.Treatment;
import com.example.management.entity.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private User doctor;





    private String doctorName;

    private String doctor_specialist;
    private String doctor_mobile;
    private String doctor_email;
    private String doctor_address;

    @JsonIgnoreProperties("doctor")
    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
    private List<Appointment> appointments = new ArrayList<>();

    @JsonIgnoreProperties("doctor")
    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
    private List<Treatment> treatments =new ArrayList<>();

    public Doctor(Long id,User doctor, String doctorName, String doctor_specialist, String doctor_mobile,
                  String doctor_email, String doctor_address) {

        this.id = id;
        this.doctor = doctor;
        this.doctorName = doctorName;
        this.doctor_specialist = doctor_specialist;
        this.doctor_mobile = doctor_mobile;
        this.doctor_email = doctor_email;
        this.doctor_address = doctor_address;
    }

    public Doctor() {

    }



    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctor_specialist() {
        return doctor_specialist;
    }

    public void setDoctor_specialist(String doctor_specialist) {
        this.doctor_specialist = doctor_specialist;
    }

    public String getDoctor_mobile() {
        return doctor_mobile;
    }

    public void setDoctor_mobile(String doctor_mobile) {
        this.doctor_mobile = doctor_mobile;
    }

    public String getDoctor_email() {
        return doctor_email;
    }

    public void setDoctor_email(String doctor_email) {
        this.doctor_email = doctor_email;
    }

    public String getDoctor_address() {
        return doctor_address;
    }

    public void setDoctor_address(String doctor_address) {
        this.doctor_address = doctor_address;
    }


    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<Treatment> getTreatments() {
        return treatments;
    }

    public void setTreatments(List<Treatment> treatments) {
        this.treatments = treatments;
    }
}
