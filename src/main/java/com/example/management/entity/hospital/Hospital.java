package com.example.management.entity.hospital;

import com.example.management.entity.user.User;
import jakarta.persistence.*;

@Entity
@Table(name = "hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hospital_name;
    private String hospital_place;
    private String hospital_type;
    private String hospital_description;
    private String hospital_address;



    public Hospital(Long id, String hospital_name, String hospital_place, String hospital_type,
                    String hospital_description, String hospital_address) {
        this.id = id;
        this.hospital_name = hospital_name;
        this.hospital_place = hospital_place;
        this.hospital_type = hospital_type;
        this.hospital_description = hospital_description;
        this.hospital_address = hospital_address;
    }

    public Hospital() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getHospital_place() {
        return hospital_place;
    }

    public void setHospital_place(String hospital_place) {
        this.hospital_place = hospital_place;
    }

    public String getHospital_type() {
        return hospital_type;
    }

    public void setHospital_type(String hospital_type) {
        this.hospital_type = hospital_type;
    }

    public String getHospital_description() {
        return hospital_description;
    }

    public void setHospital_description(String hospital_description) {
        this.hospital_description = hospital_description;
    }

    public String getHospital_address() {
        return hospital_address;
    }

    public void setHospital_address(String hospital_address) {
        this.hospital_address = hospital_address;
    }
}
