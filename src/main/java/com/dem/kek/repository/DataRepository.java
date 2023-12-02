package com.dem.kek.repository;

import com.dem.kek.model.DataCode;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface DataRepository extends MongoRepository<DataCode, String> {
    @Query("{id:'?0'}")
    DataCode findItemById(String link);

    @Query(value = "{'status': :status}", fields = "{'id' : 1, 'link' : 1}")
    List<DataCode> findByStatus(boolean status);

    public long count();
}
