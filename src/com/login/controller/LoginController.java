package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView check(@RequestParam(value="exp") Example exp){
		
		/*if(result.hasErrors()){
			ModelAndView mod=new ModelAndView("login");
			return mod;
		}*/
		String course=exp.getCourse().toString();
		System.out.println("course "+exp.getCourse());
		return new ModelAndView("info","course",course);
		
	}
	
	
}
