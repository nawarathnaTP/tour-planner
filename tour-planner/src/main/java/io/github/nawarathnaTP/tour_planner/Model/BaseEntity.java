package io.github.nawarathnaTP.tour_planner.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

/**
This is the base of every class that will be created
Removes repetition of id in every class
Makes every class serializable
 **/

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public boolean isNew(Integer id){
        return this.id == null;
    }
}
