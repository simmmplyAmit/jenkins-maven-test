package com.simpleapps.SpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/")
	public String hello() {
		return "Hello Students";
	}
	
	@RequestMapping("/showForm")
	public ModelAndView showForm() {
		
		ModelAndView mv = new ModelAndView("show-form");
		Student student = new Student();
		student.setFirstName("Amit");
		mv.addObject("student", student);
		
		return mv;
	}

	@RequestMapping("/processForm")
	public ModelAndView processForm(@ModelAttribute("student") Student student) {
		
		ModelAndView mv = new ModelAndView("student-confirmation");
//		Student student = new Student();
//		mv.addObject("student", student);
		System.out.println(student);
		return mv;
	}
	
}
