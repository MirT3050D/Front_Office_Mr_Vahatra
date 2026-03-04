package com.example.assignation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.assignation.service.PlanningService;

@Controller
public class PlanningController {
    private final PlanningService planningService;
    public PlanningController(PlanningService planningService){
        this.planningService = planningService;
    }

    @GetMapping("/planning")
    public String listPlanning(Model model){
        model.addAttribute("plannings", planningService.getVehiculePlanningInfo());
        return "Planning/list";
    }
}
