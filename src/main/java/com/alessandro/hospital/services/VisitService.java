package com.alessandro.hospital.services;

import com.alessandro.hospital.models.Visit;
import com.alessandro.hospital.repostitories.VisitRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VisitService {

    private VisitRepo visitRepo = new VisitRepo();

    public List<Visit> getFullList(){
        return visitRepo.getVisitList();
    }

    public void addVisit(Visit visit){
        visitRepo.addVisit(visit);
    }

    public List<Visit> getVisitsOfADay(LocalDate day){
        List<Visit> totalList = visitRepo.getVisitList();
        List<Visit> dayList = totalList.stream()
                .filter(item -> item.getTimestamp().toLocalDate().isEqual(day))
                .collect(Collectors.toList());
        return dayList;
    }

    public List<Visit> getVisitsOfAPeriod(LocalDate start, LocalDate end){
        List<Visit> totalList = visitRepo.getVisitList();
        List<Visit> periodList = totalList.stream()
                .filter(item -> {
                    LocalDate time = item.getTimestamp().toLocalDate();
                    return (time.isEqual(start) || time.isAfter(start)) && (time.isEqual(end)||time.isBefore(end));
                })
                .collect(Collectors.toList());

        return periodList;
    }
}
