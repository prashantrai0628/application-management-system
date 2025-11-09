package com.prash.application_management_system.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String status;


    // this means first resume will be added then applicant will be added in the database by the help of CasacadeType
    @OneToOne(mappedBy = "applicant", cascade = CascadeType.ALL)
    private Resume resume;

    @OneToMany
    private List<Application> applications = new ArrayList<>();
}
