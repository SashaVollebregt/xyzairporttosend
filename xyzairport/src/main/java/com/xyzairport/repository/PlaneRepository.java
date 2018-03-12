package com.xyzairport.repository;

import com.xyzairport.model.Plane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneRepository extends CrudRepository <Plane, Long>{

}
