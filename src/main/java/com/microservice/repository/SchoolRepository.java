package com.microservice.repository;

import com.microservice.model.School;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SchoolRepository extends JpaRepository<School,Integer> {


}
