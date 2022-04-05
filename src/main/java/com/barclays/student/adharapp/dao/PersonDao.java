package com.barclays.student.adharapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.barclays.student.adharapp.dto.Person;
import com.barclays.student.adharapp.repository.PersonRepository;

@Repository
public class PersonDao {
	
	@Autowired
	private PersonRepository personRepository;
	
	public Person savePerson(Person person) {
		return personRepository.save(person);
	}
}
