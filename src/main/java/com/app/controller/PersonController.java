package com.app.controller;

import com.app.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/persons")
    public ResponseEntity<?> getAllStudents(){
        return ResponseEntity.ok(service.getAllPerson());
    }
}

