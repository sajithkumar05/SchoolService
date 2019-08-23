package com.microservice.service;

import com.microservice.model.School;
import com.microservice.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

public class SchoolServiceImpl implements SchoolService {

@Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    RestTemplate restTemplate;

public School save(School school)
{
    return schoolRepository.save(school);
}

    @Override
    public School fetchSchoolById(int id) {
        Optional<School> school = schoolRepository.findById(id);
        if(school.isPresent())
        {
            return school.get();
        }
        else {
            return null;
        }
    }


    public List<School> findAllSchool()
    {
        return schoolRepository.findAll();
    }


}
