package com.dem.kek.repository;

import com.dem.kek.model.Jumpcode;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface JumpcodeRepository extends MongoRepository<Jumpcode, String> {
    @Query("{id:'?0'}")
    Jumpcode findStatusById(String id);
}
