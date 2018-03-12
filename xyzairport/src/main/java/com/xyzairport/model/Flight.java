package com.xyzairport.model;

import javax.persistence.*;

@Entity
public class Flight {

    // each airport has an unique id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long flightID;


    // one plane can go to many locaitons
    @ManyToOne
    private Plane plane;

    @Enumerated
    private ELocation fromLocation;
    private String ToLocation;



    //getter and setter
    public long getAirportID() {
        return flightID;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public ELocation getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(ELocation fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return ToLocation;
    }

    public void setToLocation(String toLocation) {
        ToLocation = toLocation;
    }
}
