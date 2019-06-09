package com.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Model.Child;

public interface ChildRepository  extends CrudRepository<Child,Integer>{
	public List<Child> findByFatherId(int FatherId);
	public List<Child> findByMotherId(int MotherId);		
	

}
