package com.tsdotinc.employeemanagement.api.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Post  implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String designation;
    private Integer exprienceInYears;

    public Post(Long id, String designation, Integer exprienceInYears) {
        this.id = id;
        this.designation = designation;
        this.exprienceInYears = exprienceInYears;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getExprienceInYears() {
        return exprienceInYears;
    }

    public void setExprienceInYears(Integer exprienceInYears) {
        this.exprienceInYears = exprienceInYears;
    }


}
