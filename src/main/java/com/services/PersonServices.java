package com.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.PersonRepository;
import com.Model.Person;
import lombok.Getter;

@Service
public class PersonServices {
	@Autowired
	private PersonRepository personRepo;
	public List<Person> getPersons() {
		List<Person> persons=new ArrayList<Person>();
		personRepo.findAll().forEach(p->persons.add(p));
		return persons;
	}
	
	public Person getperson(int personId) {
		//return persons.stream().filter(p->p.getId()==personId).findFirst().get();
		return personRepo.findOne(personId);
		
	}

	public Person setPerson(Person person) {
		return personRepo.save(person);
	}

	public Person updatePerson(Person person) {
		return personRepo.save(person);
	}

	public List<Person> deletePerson(int personId) {
		personRepo.delete(personId);
		List<Person> persons=new ArrayList<Person>();
		personRepo.findAll().forEach(p->persons.add(p));
		return persons; 
	}
}
