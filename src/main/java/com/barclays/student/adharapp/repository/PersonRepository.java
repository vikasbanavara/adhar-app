package com.barclays.student.adharapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barclays.student.adharapp.dto.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
