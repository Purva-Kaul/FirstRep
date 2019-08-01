package com.SpringSecurityTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping(value = { "/", "/welcome" })
	public String welcomePage(Model model) {

		
		model.addAttribute("title", "Spring Security Hello World");
		model.addAttribute("message", "This is welcome page!");
		
		return "hello";

	}

	@RequestMapping(value = "/admin")
	public String adminPage(Model model) {

		
		model.addAttribute("title", "Spring Security Hello World");
		model.addAttribute("message", "This is protected page!");
		

		return "admin";

	}

}