package com.vijay.UberRideSpringBootAPI.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Getter
@ToString
@NoArgsConstructor
public class UberRide {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    private int thrillFactor;
    private int comfortFactor;

    public UberRide(String name, String description, int thrillFactor, int comfortFactor) {
        this.name = name;
        this.description = description;
        this.thrillFactor = thrillFactor;
        this.comfortFactor = comfortFactor;
    }

}
