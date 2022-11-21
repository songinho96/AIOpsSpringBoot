package com.project.backend.entity;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity(name = "chart")
@Data
public class Chart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hostname;

    private String datetime;

    private String resource_type;

    private String metric_type;

    private Double value;

    private String unit;



}
