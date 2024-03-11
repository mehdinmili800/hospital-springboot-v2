package com.example.management.entity.medicines;

import jakarta.persistence.*;

@Entity
@Table(name = "medicines")
public class Medicines {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String medicine_name;
    private String medicine_company;
    private String medicine_composition;
    private String medicine_cost;
    private String medicine_type;
    private String medicine_dose;
    private String medicine_description;


    public Medicines(Long id, String medicine_name, String medicine_company, String medicine_composition,
                     String medicine_cost, String medicine_type, String medicine_dose, String medicine_description) {
        this.id = id;
        this.medicine_name = medicine_name;
        this.medicine_company = medicine_company;
        this.medicine_composition = medicine_composition;
        this.medicine_cost = medicine_cost;
        this.medicine_type = medicine_type;
        this.medicine_dose = medicine_dose;
        this.medicine_description = medicine_description;
    }


    public Medicines() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedicine_name() {
        return medicine_name;
    }

    public void setMedicine_name(String medicine_name) {
        this.medicine_name = medicine_name;
    }

    public String getMedicine_company() {
        return medicine_company;
    }

    public void setMedicine_company(String medicine_company) {
        this.medicine_company = medicine_company;
    }

    public String getMedicine_composition() {
        return medicine_composition;
    }

    public void setMedicine_composition(String medicine_composition) {
        this.medicine_composition = medicine_composition;
    }

    public String getMedicine_cost() {
        return medicine_cost;
    }

    public void setMedicine_cost(String medicine_cost) {
        this.medicine_cost = medicine_cost;
    }

    public String getMedicine_type() {
        return medicine_type;
    }

    public void setMedicine_type(String medicine_type) {
        this.medicine_type = medicine_type;
    }

    public String getMedicine_dose() {
        return medicine_dose;
    }

    public void setMedicine_dose(String medicine_dose) {
        this.medicine_dose = medicine_dose;
    }

    public String getMedicine_description() {
        return medicine_description;
    }

    public void setMedicine_description(String medicine_description) {
        this.medicine_description = medicine_description;
    }
}
