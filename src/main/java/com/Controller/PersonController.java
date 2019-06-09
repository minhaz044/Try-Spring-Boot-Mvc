package com.Controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Model.Person;

@RestController
public class PersonController {
	@RequestMapping("/persons")
	public String getTopics() {
	
		return "WellCome to Person Page";
	}
}
