package com.barclays.student.adharapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.barclays.student.adharapp.dao.PersonDao;
import com.barclays.student.adharapp.dto.Person;
import com.barclays.student.adharapp.dto.ResponseStructure;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;
	
	public ResponseStructure<Person> savePerson(Person person) {
		ResponseStructure<Person> responseStructure = new ResponseStructure<Person>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("Person saved");
		responseStructure.setData(personDao.savePerson(person));
		return responseStructure;
	}
}
