package com.simpleapps.SpringMvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/parent")
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
//	@RequestMapping("/processForm")
//	public String hello(HttpServletRequest request, Model model) {
//		String name = request.getParameter("name");
//		model.addAttribute("name", name);
//		return "HelloWorld";
//	}

	@RequestMapping("/processForm")
	public String hello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "HelloWorld";
	}
}
