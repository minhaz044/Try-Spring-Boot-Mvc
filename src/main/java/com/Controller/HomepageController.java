package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Model.Sum;

@Controller
public class HomepageController {

	@RequestMapping
	public ModelAndView index() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(method=RequestMethod.POST, value="/sum")
	public ModelAndView sum(Sum sum) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("sum");
		mv.addObject("name",sum.getA()+sum.getB());
		System.out.println(sum.getA()+sum.getB());
		return mv;
	}
}
