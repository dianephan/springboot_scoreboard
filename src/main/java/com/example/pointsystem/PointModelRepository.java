package com.example.pointsystem;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointModelRepository extends CrudRepository<PointModel, Integer> {
    // file is done, spring generates class and thats it. they just know
}
