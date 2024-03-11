package com.example.management.dto.user;

public class NursesResponseDTO {


    private String username;
    private String password;
    private String nurse_name;
    private String nurse_duty_hour;
    private String nurse_mobile;
    private String nurse_email;
    private String nurse_address;

    public NursesResponseDTO(){}

    public NursesResponseDTO(String username, String password, String nurse_name, String nurse_duty_hour,
                             String nurse_mobile, String nurse_email, String nurse_address) {
        this.username = username;
        this.password = password;
        this.nurse_name = nurse_name;
        this.nurse_duty_hour = nurse_duty_hour;
        this.nurse_mobile = nurse_mobile;
        this.nurse_email = nurse_email;
        this.nurse_address = nurse_address;
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
}
