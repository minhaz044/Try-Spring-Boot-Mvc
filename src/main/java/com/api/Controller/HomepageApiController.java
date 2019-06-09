package com.api.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageApiController {
	@RequestMapping("/api/")
	public String sayHi() {
		return "Hi! WellCome to pur API HomePage";
	}

}
