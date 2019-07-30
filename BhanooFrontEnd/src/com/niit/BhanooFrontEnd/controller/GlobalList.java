package com.niit.BhanooFrontEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.proj1.DAO.CategoryDAO;
import com.proj1.model.Category;

@ControllerAdvice
public class GlobalList {
	
	@Autowired
	CategoryDAO categoryDAO;

	@ModelAttribute("categories")
	public List<Category> getAll(){
		return categoryDAO.list();
	}
}
