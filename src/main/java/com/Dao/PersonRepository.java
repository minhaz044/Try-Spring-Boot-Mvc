package com.Dao;

import org.springframework.data.repository.CrudRepository;

import com.Model.Person;

public interface PersonRepository  extends CrudRepository<Person,Integer>{

}
