package com.api.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Child;
import com.services.ChildServices;
@RestController
public class ChildApiController {
	@Autowired
	private ChildServices childServices;
	@RequestMapping("/api/persons/childs")
	public List<Child> getChild() {
		return childServices.getChild();
	}
	
	@RequestMapping("/api/persons/{parentsType}/{personId}/childs")
	public List<Child> getChildByFatherId(@PathVariable String parentsType,@PathVariable int personId) {
		return parentsType.toLowerCase().equals("father")?childServices.getChildByFatherId(personId):childServices.getChildByMotherId(personId);
		
	}

	
	@RequestMapping(method=RequestMethod.POST ,value="/api/persons/childs")
	public Child addChild(@RequestBody Child child) {
		return  childServices.setChild(child);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/api/persons/childs")
	public Child updateChild(@RequestBody Child child) {
			return childServices.updateChild(child);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/api/persons/childs/{childId}")
	public List<Child>  deleteChild(@PathVariable int childId) {
			return childServices.deleteChild(childId);
	}
}
