package io.github.nawarathnaTP.tour_planner.Model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@MappedSuperclass
public class Place extends BaseEntity{

    @Column
    @NotBlank
    private String name;

    @Column
    private String description;

    @Column
    @NotNull
    private BigDecimal latitude;

    @Column
    @NotNull
    private BigDecimal longitude;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
    public BigDecimal getLatitude(){
        return this.latitude;
    }

    public void setLatitude(BigDecimal latitude){
        this.latitude = latitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLongitude(){
        return this.longitude;
    }
}
