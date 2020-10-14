package com.absolutehh.app.data.service;

import com.absolutehh.app.data.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}