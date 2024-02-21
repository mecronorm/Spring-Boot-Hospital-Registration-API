package com.alessandro.hospital.repostitories;

import com.alessandro.hospital.models.Doctor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DoctorRepo {
    private Map<Integer, Doctor> doctorList = new HashMap<>();
    private int id = 1;

    public void addDoctor(Doctor doctor){
        doctorList.put(id, doctor);
        this.id++;
    }

    public void changeDoctor(Doctor doctor, int id){
        doctorList.replace(id, doctor);
    }

    public Doctor getDoctorById(int id){
        return doctorList.get(id);
    }

    public Map<Integer, Doctor> getDoctorList() {
        return doctorList;
    }

    public void deleteDoctor(int id){
        doctorList.remove(id);
    }

    @Override
    public String toString() {
        String returnString = "";
        for (int id: doctorList.keySet()){
            returnString = returnString + doctorList.get(id).toString()+" || id: "+id+"\n";
        }
        return returnString;
    }
}
