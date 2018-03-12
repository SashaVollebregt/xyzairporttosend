package com.xyzairport.service;


import com.xyzairport.model.ELocation;
import com.xyzairport.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.xml.stream.Location;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

//    @Autowired
//    private ELocation location;

    @PostConstruct
    public void init(){

    }
}
