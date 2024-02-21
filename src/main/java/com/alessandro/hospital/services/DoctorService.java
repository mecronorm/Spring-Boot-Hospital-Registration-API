package com.alessandro.hospital.services;

import com.alessandro.hospital.models.Doctor;
import com.alessandro.hospital.repostitories.DoctorRepo;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class DoctorService {

    private DoctorRepo doctorRepo = new DoctorRepo();

    public void addDoctor(Doctor doctor){
        doctorRepo.addDoctor(doctor);
    }

    public void updateDoctor(Doctor doctor, int id){
        doctorRepo.changeDoctor(doctor, id);
    }

    public void deleteDoctor(int id){
        doctorRepo.deleteDoctor(id);
    }

    public Map<Integer, Doctor> getAllDoctors(){
        return doctorRepo.getDoctorList();
    }

    public Doctor getDoctorById(int id){
        return doctorRepo.getDoctorById(id);
    }
}
