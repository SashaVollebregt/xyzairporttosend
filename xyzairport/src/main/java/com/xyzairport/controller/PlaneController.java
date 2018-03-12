package com.xyzairport.controller;

import com.xyzairport.model.Flight;
import com.xyzairport.model.Plane;
import com.xyzairport.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/plane/")
public class PlaneController {
    @Autowired
    private PlaneRepository planeRepository;


    /**
     * Find all the planes
     * @return planeRepository
     */
    @RequestMapping(value="", method= RequestMethod.GET)
    public Iterable<Plane> findAll(){
        return this.planeRepository.findAll();
    }



}
