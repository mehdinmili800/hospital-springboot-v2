package com.example.management.entity.user.nurses;

import com.example.management.entity.appointment.Appointment;
import com.example.management.entity.user.User;
import com.example.management.entity.user.doctor.Doctor;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "nurses")
public class Nurses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nurses_id")
    private User nurses;

    private String nurse_name;
    private String nurse_duty_hour;
    private String nurse_mobile;
    private String nurse_email;
    private String nurse_address;

    @OneToMany(mappedBy = "nurses", cascade = CascadeType.ALL)
    private List<Appointment> appointments;


    public Nurses(Long id, User nurses, String nurse_name, String nurse_duty_hour, String nurse_mobile,
                  String nurse_email, String nurse_address) {
        this.id = id;
        this.nurses = nurses;
        this.nurse_name = nurse_name;
        this.nurse_duty_hour = nurse_duty_hour;
        this.nurse_mobile = nurse_mobile;
        this.nurse_email = nurse_email;
        this.nurse_address = nurse_address;
    }

    public Nurses() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public User getNurses() {
        return nurses;
    }

    public void setNurses(User nurses) {
        this.nurses = nurses;
    }

    public String getNurse_name() {
        return nurse_name;
    }

    public void setNurse_name(String nurse_name) {
        this.nurse_name = nurse_name;
    }

    public String getNurse_duty_hour() {
        return nurse_duty_hour;
    }

    public void setNurse_duty_hour(String nurse_duty_hour) {
        this.nurse_duty_hour = nurse_duty_hour;
    }

    public String getNurse_mobile() {
        return nurse_mobile;
    }

    public void setNurse_mobile(String nurse_mobile) {
        this.nurse_mobile = nurse_mobile;
    }

    public String getNurse_email() {
        return nurse_email;
    }

    public void setNurse_email(String nurse_email) {
        this.nurse_email = nurse_email;
    }

    public String getNurse_address() {
        return nurse_address;
    }

    public void setNurse_address(String nurse_address) {
        this.nurse_address = nurse_address;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
