package com.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.ChildRepository;
import com.Model.Child;

@Service
public class ChildServices {
	@Autowired
	private ChildRepository childRepo;
	
	public List<Child> getChild() {
		List<Child> childs=new ArrayList<Child>();
		childRepo.findAll().forEach(c->childs.add(c));
		return childs;
	}
	
	public List<Child> getChildByFatherId(int personId) {
		return childRepo.findByFatherId(personId);
		
	}
	public List<Child> getChildByMotherId(int personId) {
		return childRepo.findByMotherId(personId);
		
	}
	public Child setChild(Child child) {
		return childRepo.save(child);
	}

	public Child updateChild(Child child) {
		return childRepo.save(child);
	}

	public List<Child> deleteChild(int childId) {
		childRepo.delete(childId);
		List<Child> childs=new ArrayList<Child>();
		childRepo.findAll().forEach(c->childs.add(c));
		return childs; 
	}
}
