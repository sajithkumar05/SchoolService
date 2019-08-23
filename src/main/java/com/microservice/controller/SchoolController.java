package com.microservice.controller;


import com.microservice.model.School;
import com.microservice.repository.SchoolRepository;
import com.microservice.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/service")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private SchoolRepository schoolRepository;


        // get school
        @RequestMapping(value="/school",method = RequestMethod.GET)
        public List<School> getschool(){
            return schoolService.findAllSchool();
        }

        //save school
        @RequestMapping(value = "/school", method = RequestMethod.POST)
        public School save(@RequestBody School school)

        {
                return schoolService.save(school);
        }

        //ResponseEntity check whether school entity is empty or not
        @RequestMapping(value = "/school", method = RequestMethod.GET)
        public ResponseEntity<Object> fetchSchool(@RequestParam int id)
        {
        School school = schoolService.fetchSchoolById(id);
        if(school==null){
        return ResponseEntity.notFound().build();
        }
        else
        {
            return ResponseEntity.ok().body(school);
        }
        }

}
