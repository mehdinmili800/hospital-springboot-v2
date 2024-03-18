package com.example.management.dto.user;

public class EmployeeResponseDTO {

    private String username;
    private String password;

    private String employeeName;
    private String email;

    private String phone;


    public EmployeeResponseDTO(){}
    public EmployeeResponseDTO(String username, String password,String employeeName, String email, String phone) {
        this.username = username;
        this.password = password;
        this.employeeName = employeeName;
        this.email = email;
        this.phone = phone;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
