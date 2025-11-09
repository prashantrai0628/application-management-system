package com.prash.application_management_system.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String status;
    private String position;

    @ManyToOne
    @JoinColumn(name = "applicantId", nullable = false)
    private Applicant applicant;

}
