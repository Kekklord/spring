package com.dem.kek.controller;

import com.dem.kek.model.DataCode;
import com.dem.kek.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/datacodes")
public class DataCodeController {
    @Autowired
    DataRepository dataRepository;

    @GetMapping
    public List<DataCode> getAllData() {
        return dataRepository.findAll();
    }

    @GetMapping("/{id}")
    public DataCode getDataById(@PathVariable String id) {
        return dataRepository.findItemById(id);
    }

    @GetMapping("/status/{status}")
    public List<DataCode> getDataByStatus(@PathVariable boolean status) {
        System.out.println("Status : " + status);
        return dataRepository.findByStatus(status);
    }

    @GetMapping("/count")
    public long getDataCount() {
        return dataRepository.count();
    }
}
