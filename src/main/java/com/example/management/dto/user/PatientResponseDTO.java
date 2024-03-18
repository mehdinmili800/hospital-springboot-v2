package com.example.management.dto.user;

public class PatientResponseDTO {

    private String username;
    private String password;
    private String patientName;
    private String patient_mobile;
    private String patient_email;
    private String patient_address;

    public PatientResponseDTO(){}

    public PatientResponseDTO(String username, String password, String patientName, String patient_mobile,
                              String patient_email, String patient_address) {
        this.username = username;
        this.password = password;
        this.patientName = patientName;
        this.patient_mobile = patient_mobile;
        this.patient_email = patient_email;
        this.patient_address = patient_address;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
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
}
