package com.app.services;

import com.app.dao.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    // mockito -> Mocking the database | using Mockito library
    @Mock
    private PersonRepository dao;

    // @Autowired not to be used otherwise it will invoke the actual repository
    // layer
    private PersonService service;

    @Test
    void getAllPerson() {
        this.service.getAllPerson();
        verify(dao).findAll();
    }

    @BeforeEach
    void setUp() {
        this.service = new PersonService(this.dao);
    }
}