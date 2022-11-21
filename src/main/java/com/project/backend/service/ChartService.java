package com.project.backend.service;

import com.project.backend.entity.Chart;
import com.project.backend.repository.ChartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChartService {

    @Autowired
    private ChartRepository chartRepository;

    public List<Chart> chartList() {
        System.out.println("chart" + chartRepository.findAll());
        return chartRepository.findAll();
    }



}
