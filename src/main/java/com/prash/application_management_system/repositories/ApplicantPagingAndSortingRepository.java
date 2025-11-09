package com.prash.application_management_system.repositories;

import com.prash.application_management_system.Entity.Applicant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

public interface ApplicantPagingAndSortingRepository extends ListPagingAndSortingRepository<Applicant,Long>, CrudRepository<Applicant,Long> {
}
