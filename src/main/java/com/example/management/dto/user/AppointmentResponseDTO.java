package com.example.management.dto.user;


public class AppointmentResponseDTO {

    private Long id;
    private String appointment_number;
    private String appointment_type;
    private String appointment_date;
    private String appointment_description;



    public AppointmentResponseDTO(){}

    public AppointmentResponseDTO(Long id, String appointment_number, String appointment_type, String appointment_date, String appointment_description) {
        this.id = id;
        this.appointment_number = appointment_number;
        this.appointment_type = appointment_type;
        this.appointment_date = appointment_date;
        this.appointment_description = appointment_description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
