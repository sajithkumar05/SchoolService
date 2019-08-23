package com.microservice.service;

import com.microservice.model.School;

import java.util.List;


public interface SchoolService {

    School save(School school);
    List<School> findAllSchool();
    School fetchSchoolById(int id);
}
