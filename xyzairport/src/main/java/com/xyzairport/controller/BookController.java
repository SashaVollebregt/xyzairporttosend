package com.xyzairport.controller;


import com.xyzairport.model.Flight;
import com.xyzairport.model.Plane;
import com.xyzairport.repository.FlightRepository;
import com.xyzairport.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/booking/")
public class BookController {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private PlaneRepository planeRepository;




}
