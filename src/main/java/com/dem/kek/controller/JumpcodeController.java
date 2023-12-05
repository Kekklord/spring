package com.dem.kek.controller;

import com.dem.kek.model.Jumpcode;
import com.dem.kek.repository.JumpcodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class JumpcodeController {
    @Autowired
    JumpcodeRepository jumpcodeRepository;

    @GetMapping("/{id}")
    public Jumpcode getStatusById(@PathVariable String id) {
        return jumpcodeRepository.findStatusById(id);
    }
}
