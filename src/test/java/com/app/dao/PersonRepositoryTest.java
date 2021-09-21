package com.app.dao;

import com.app.entities.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class PersonRepositoryTest {

    @Autowired
    private PersonRepository dao;

    @Test
    void isPersonExistsById() {
        Person person = new Person(12, "Shrijeet Panda", "Pune");
        dao.save(person);

        Boolean actual = dao.isPersonExistsById(12);

        assertThat(actual).isTrue();

    }

// will run after test-case
// can be used to clean up the data.
    @AfterEach
    void tearDown() {
        dao.deleteAll();
    }
}