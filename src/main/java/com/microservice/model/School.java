package com.microservice.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="school")
public class School  {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String schoolName;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
