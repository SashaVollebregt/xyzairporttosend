package com.xyzairport.controller;

import com.xyzairport.model.Flight;
import com.xyzairport.model.Plane;
import com.xyzairport.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/flights/")
public class FlightController {
    @Autowired
    private FlightRepository flightRepository;

    @RequestMapping(value="", method= RequestMethod.GET)
    public Iterable<Flight> findAll(){
        return this.flightRepository.findAll();
    }

    @RequestMapping(value="save", method = RequestMethod.POST)
    public void saveFlight(@RequestBody Flight saveflight){
        flightRepository.save(saveflight);
    }

//    @RequestMapping(value="delete", method = RequestMethod.DELETE)
//    public void delete(@PathVariable long flightID){
//        flightRepository.deleteById(flightID);
//    }

    @RequestMapping(value="bookflight", method = RequestMethod.PUT)
    public void bookflight(@PathVariable long planeID, @RequestBody Plane planeFlying){
        // receive the plane

        // change flying to true


    }
}
