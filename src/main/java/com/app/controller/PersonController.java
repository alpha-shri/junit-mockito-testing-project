package com.app.controller;

import com.app.entities.Person;
import java.util.List;
import com.app.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping("/persons")
    @ResponseStatus(HttpStatus.OK)
    public List<Person> getAllStudents(){
        return this.service.getAllPerson();
    }

    @GetMapping("/findbyid/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Person findById(@PathVariable int id){
        return service.findByIdService(id);
    }
}
