package com.api.Controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Person;
import com.services.PersonServices;

@RestController
public class PersonApiController {
	@Autowired
	private PersonServices personServices;
	@RequestMapping("/api/persons")
	public List<Person> getTopics() {
		return personServices.getPersons();
	}
	
	@RequestMapping("/api/persons/{personId}")
	public Person getPerson(@PathVariable int personId) {
		return personServices. getperson(personId);
	}
	
	
	@RequestMapping(method=RequestMethod.POST ,value="/api/persons")
	public Person addPerson(@RequestBody Person person) {
		return personServices.setPerson(person);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/persons")
	public Person updatePerson(@RequestBody Person person) {
			return personServices.updatePerson(person);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/api/persons/{personId}")
	public List<Person>  deletePerson(@PathVariable int personId) {
			return personServices.deletePerson(personId);
	}

}
