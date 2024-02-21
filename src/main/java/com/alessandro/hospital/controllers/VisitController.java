package com.alessandro.hospital.controllers;

import com.alessandro.hospital.models.Visit;
import com.alessandro.hospital.services.VisitService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping
public class VisitController {
    private VisitService visitService = new VisitService();

    @PostMapping("api/visit")
    public String createVisit(@RequestBody Visit visit){
        visitService.addVisit(visit);
        return "Successfully added visit";
    }

    @GetMapping("api/visit")
    public List<Visit> getVisitsOfADay(@RequestParam("day")LocalDate date){
        return visitService.getVisitsOfADay(date);
    }

    @GetMapping("api/visit/periode")
    public List<Visit> getVisitsOfAPeriode(@RequestParam("start")LocalDate start,
                                           @RequestParam("end")LocalDate end){
        return visitService.getVisitsOfAPeriod(start,end);
    }



}
