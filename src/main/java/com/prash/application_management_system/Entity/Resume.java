package com.prash.application_management_system.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resume {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String content;

    //foreign key
    @OneToOne
    @JoinColumn(name = "applicantId", nullable = false)
    @JsonIgnore  // for seriazation duplicaate data json mei aane lgte h infinite loop
    private Applicant applicant;



}
