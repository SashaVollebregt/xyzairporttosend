package com.xyzairport.service;

import com.xyzairport.model.ELocation;
import com.xyzairport.model.Flight;
import com.xyzairport.model.Plane;
import com.xyzairport.repository.FlightRepository;
import com.xyzairport.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import static com.xyzairport.model.ELocation.AMSTERDAM;
import static com.xyzairport.model.ELocation.BERLIN;

@Service
public class PlaneService {
    @Autowired
    private PlaneRepository planeRepository;

    @Autowired
    private FlightRepository flightRepository;
//    @Autowired
//    private ELocation location;

    @PostConstruct
    public void init(){
        Plane p1 = new Plane();
        p1.setFuel(5);
        p1.setStationed(AMSTERDAM);
        p1.setType("Airbus");
        p1.setFlying(true);
        this.planeRepository.save(p1);

        Plane p2 = new Plane();
        p2.setFuel(5);
        p2.setStationed(BERLIN);
        p2.setType("Airbus 505");
        p1.setFlying(true);
        this.planeRepository.save(p2);

        Plane p3 = new Plane();
        p3.setFuel(5);
        p3.setStationed(BERLIN);
        p3.setType("Airbus 505");
        p3.setFlying(true);
        this.planeRepository.save(p3);

        Flight f1 = new Flight();
        f1.setFromLocation(p1.getStationed());
        f1.setToLocation("Berlin");
        this.flightRepository.save(f1);

        Flight f2 = new Flight();
        f2.setFromLocation(p2.getStationed());
        f2.setToLocation("Paris");
        this.flightRepository.save(f2);

        f1.setPlane(p1);
        f2.setPlane(p2);

        this.planeRepository.save(p1);
        this.planeRepository.save(p2);
        this.flightRepository.save(f1);
        this.flightRepository.save(f2);



    }

}
