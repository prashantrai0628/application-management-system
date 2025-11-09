package com.prash.application_management_system.repositories;

import com.prash.application_management_system.Entity.Applicant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ApplicantCrudRepository extends ListCrudRepository<Applicant,Long> {

}
