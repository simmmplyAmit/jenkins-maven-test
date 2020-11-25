package com.simpleapps.SpringMvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
//	InitBinding to intercept all the form data and preprocess the data
	@InitBinder
	public void preProcess(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmer);
	}
	
	@RequestMapping("showForm")
	public ModelAndView showForm() {
		ModelAndView mv = new ModelAndView("customer-form");
		mv.addObject("customer", new Customer());
		return mv;
	}
	
	@RequestMapping("processForm")
	public ModelAndView processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		
		
	System.out.printf("Result %s",result);
	ModelAndView mv = new ModelAndView();
	
	if(result.hasErrors()) {
		mv.setViewName("customer-form");
	}else {
		mv.setViewName("customer-confirmation");
	}
	
	return mv;
	}
}
