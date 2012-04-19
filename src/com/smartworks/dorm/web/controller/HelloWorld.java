package com.smartworks.dorm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/HelloWorld")
public class HelloWorld {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView  show()  {
	
	ModelAndView model1 = new ModelAndView("HelloWorld");
	return model1;
		
	}
}
