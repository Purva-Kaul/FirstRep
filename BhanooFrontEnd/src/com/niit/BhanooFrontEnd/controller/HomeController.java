package com.niit.BhanooFrontEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proj1.DAO.ProductDAO;

@Controller
public class HomeController {

	
	@Autowired//Spring
	ProductDAO productDAO;
	
	@RequestMapping(value= {"/","/category/All"})
	public String Home(Model model) {
		model.addAttribute("userClickedHome", true);
		//model.addAttribute("categories", categoryDAO.list());
		model.addAttribute("products", productDAO.listActiveProducts());//hibernate by product dao
		
		return "index";
	}
	
	@RequestMapping("/category/{id}")
	public String filterByCategory(@PathVariable("id")int id,Model model) {
		
		model.addAttribute("userClickedHome", true);
		//model.addAttribute("categories", categoryDAO.list());
		model.addAttribute("products", productDAO.listActiveProductsByCategory(id));//hibernate by product dao
		
		return "index";
	}
	
	
	
}
  	