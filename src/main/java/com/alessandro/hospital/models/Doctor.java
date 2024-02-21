package com.alessandro.hospital.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Doctor {
    private String name;
    private String specialization;

    @JsonCreator
    public Doctor(@JsonProperty("name") String name,
                  @JsonProperty("specialization") String specialization
                  ){
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "name: "+name+" || specialization: "+specialization;
    }
}
