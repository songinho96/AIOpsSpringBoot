package com.project.backend.entity;


import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "member")
@Data
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String email;


    private String password;


    private String username;

}
