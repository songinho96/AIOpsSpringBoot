package com.project.backend.controller;
import com.project.backend.entity.Chart;
import com.project.backend.service.ChartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ChartController {

    private final ChartService chartService;


//    @GetMapping("/chart/list")
//    public String chartList(Model model) {
//
//        model.addAttribute("list", chartService.chartList());
//
//        return "chartList";
//    }

    @GetMapping("/api/chart")
    public List<Chart> list(){
        return chartService.chartList();
    }


}
