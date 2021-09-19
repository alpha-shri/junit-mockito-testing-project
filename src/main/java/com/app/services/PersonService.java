package com.app.services;

import com.app.dao.PersonRepository;
import com.app.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository dao;

    public List<Person> getAllPerson() {
        return this.dao.findAll();
    }
}
