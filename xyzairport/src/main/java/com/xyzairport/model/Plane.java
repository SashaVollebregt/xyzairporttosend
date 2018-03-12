package com.xyzairport.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.List;

@Entity
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long planeID;

    // you want one plane to to go to multiple locations
    @JsonIgnore
    @OneToMany(fetch=FetchType.EAGER, mappedBy = "plane")
    private List<Flight> flight;

    private String type;
    private int fuel;

    @Enumerated
    private ELocation stationed;
    private boolean flying;

    // getter and setter
    public long getPlaneID() {
        return planeID;
    }

    public List<Flight> getFlight() {
        return flight;
    }

    public void setFlight(List<Flight> flight) {
        this.flight = flight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public ELocation getStationed() {
        return stationed;
    }

    public void setStationed(ELocation stationed) {
        this.stationed = stationed;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }
}
