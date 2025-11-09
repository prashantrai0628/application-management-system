package com.prash.application_management_system.repositories;

import com.prash.application_management_system.Entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application,Long> {
}
