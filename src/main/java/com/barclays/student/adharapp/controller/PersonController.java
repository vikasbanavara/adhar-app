package com.barclays.student.adharapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.student.adharapp.dto.Person;
import com.barclays.student.adharapp.dto.ResponseStructure;
import com.barclays.student.adharapp.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;

	@PostMapping("/person")
	public ResponseStructure<Person> savePerson(@RequestBody Person person) {
		return personService.savePerson(person);
	}
}
