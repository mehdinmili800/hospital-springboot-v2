package com.example.management.entity.user.doctor;

import com.example.management.entity.appointment.Appointment;
import com.example.management.entity.user.User;
import com.example.management.entity.user.nurses.Nurses;
import com.example.management.entity.user.patient.Patient;
import jakarta.persistence.*;

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


    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Appointment> appointments;





    private String doctor_name;
    private String doctor_specialist;
    private String doctor_mobile;
    private String doctor_email;
    private String doctor_address;

    public Doctor(User doctor, String doctor_name, String doctor_specialist, String doctor_mobile,
                  String doctor_email, String doctor_address) {

        this.doctor = doctor;
        this.doctor_name = doctor_name;
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

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
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
}
