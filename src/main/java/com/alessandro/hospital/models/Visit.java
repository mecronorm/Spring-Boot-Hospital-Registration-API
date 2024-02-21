package com.alessandro.hospital.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class Visit {
    private String firstName;
    private String lastName;
    private int doctorId;
    private LocalDateTime timestamp;

    @JsonCreator
    public Visit(   @JsonProperty("firstName") String firstName,
                    @JsonProperty("lastName") String lastName,
                    @JsonProperty("doctorId") int doctorId,
                    @JsonProperty("timestamp") String timestamp
    ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.doctorId = doctorId;
        this.timestamp = LocalDateTime.parse(timestamp);
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
