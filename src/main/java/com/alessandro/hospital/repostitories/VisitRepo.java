package com.alessandro.hospital.repostitories;

import com.alessandro.hospital.models.Visit;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class VisitRepo {
    private ArrayList<Visit> visitList = new ArrayList<>();

    public void addVisit(Visit visit){
        visitList.add(visit);
    }

    public ArrayList<Visit> getVisitList() {
        return visitList;
    }
}
