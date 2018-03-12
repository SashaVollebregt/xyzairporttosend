package com.xyzairport.repository;

import com.xyzairport.model.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {

//    void deleteById(long id);
}
