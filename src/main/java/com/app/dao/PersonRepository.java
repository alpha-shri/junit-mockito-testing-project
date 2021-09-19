package com.app.dao;

import com.app.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Query("SELECT CASE WHEN COUNT(p) >0 THEN TRUE ELSE FALSE END FROM person p WHERE s.id = ?1")
    Boolean isPersonExistsById(Integer id);
}
