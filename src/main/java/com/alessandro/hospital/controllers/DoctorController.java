package com.alessandro.hospital.controllers;

import com.alessandro.hospital.models.Doctor;
import com.alessandro.hospital.services.DoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.naming.ldap.HasControls;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
public class DoctorController {
    private DoctorService doctorService = new DoctorService();

    @PostMapping ("/api/doctors")
    public String addDoctors(@RequestBody Doctor doctor){
        this.doctorService.addDoctor(doctor);
        return "Doctor added successfully";
    }


    @PutMapping("/api/doctors/{id}")
    public String updateDoctor(
            @PathVariable("id") String id,
            @RequestBody Doctor doctor
    ){
        this.doctorService.updateDoctor(doctor, Integer.valueOf(id));
        return "Successfully updated doctor";
    }

    @GetMapping("api/doctors")
    public Map<Integer, Doctor> getAllDoctors(){
        return this.doctorService.getAllDoctors();
    }

    @GetMapping("api/doctors/{id}")
    public Doctor getDoctorById(
            @PathVariable("id") String id
    ){
        return this.doctorService.getDoctorById(Integer.valueOf(id));
    }

    @DeleteMapping("api/doctors/{id}")
    public String deleteDoctorById(
            @PathVariable("id") String id
    ){
        this.doctorService.deleteDoctor(Integer.valueOf(id));
        return "Successfully removed doctor";
    }
}
