package com.example.management.dto.user;

public class DoctorResponseDTO {

    private String username;
    private String password;
    private String doctor_name;
    private String doctor_specialist;
    private String doctor_mobile;
    private String doctor_email;
    private String doctor_address;

    public DoctorResponseDTO(){}

    public DoctorResponseDTO(String username, String password, String doctor_name, String doctor_specialist, String doctor_mobile, String doctor_email, String doctor_address) {
        this.username = username;
        this.password = password;
        this.doctor_name = doctor_name;
        this.doctor_specialist = doctor_specialist;
        this.doctor_mobile = doctor_mobile;
        this.doctor_email = doctor_email;
        this.doctor_address = doctor_address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
