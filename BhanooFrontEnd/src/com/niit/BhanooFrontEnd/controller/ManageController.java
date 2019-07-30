package com.niit.BhanooFrontEnd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.BhanooFrontEnd.util.FileUtil;
import com.proj1.DAO.CategoryDAO;
import com.proj1.DAO.ProductDAO;
import com.proj1.model.Category;
import com.proj1.model.Product;

@Controller
@RequestMapping("/manage")
public class ManageController {

	@Autowired
	// ProductDAO productDAO=new ProductDAOImpl()
	ProductDAO productDAO;

	@Autowired // Spring
	CategoryDAO categoryDAO;

	@GetMapping("/product")
	public String addProd(Model model) {
		model.addAttribute("userClickedManageProd", true);

		model.addAttribute("product", new Product());
		model.addAttribute("title", "Add");
		model.addAttribute("actionURL", "product");
		model.addAttribute("category", new Category());
		// model.addAttribute("products", productDAO.list());
		return "index";
	}

	@GetMapping("/updateProduct/{id}")
	public String updateProd(@PathVariable("id") int id, Model model) {
		model.addAttribute("userClickedManageProd", true);
		model.addAttribute("title", "Edit");
		model.addAttribute("product", productDAO.get(id));
		model.addAttribute("actionURL", "updateProduct");
		model.addAttribute("category", new Category());
		// model.addAttribute("products", productDAO.list());
		return "index";
	}

	@PostMapping("/updateProduct")
	public String UpdateProd(@ModelAttribute("product") Product product) {

		productDAO.update(product);

		return "redirect:/manage/product";
	}

	@GetMapping("/changeStatus/{id}")
	public String changeStatus(@PathVariable("id") int id) {

		productDAO.delete(id);

		return "redirect:/manage/product";
	}

	@PostMapping("/product")
	public String SaveProd(@Valid @ModelAttribute("product") Product product
			, BindingResult result
			, Model model
			,HttpServletRequest req) {
		
		if (result.hasErrors()) {
			model.addAttribute("userClickedManageProd", true);
			model.addAttribute("category", new Category());
			return "index";
		}
		
		//File Uploding
		FileUtil.uploadFile(req, product.getFile(), product.getCode());
		
		productDAO.add(product);

		return "redirect:/manage/product";
	}

	/*
	 * @GetMapping("/addCat") public String addCat(Model model) {
	 * model.addAttribute("userClickedAddCat", true); model.addAttribute("category",
	 * new Category()); return "index"; }
	 */

	@PostMapping("/addCat")
	public String SaveCat(@ModelAttribute("category") Category category) {

		categoryDAO.add(category);

		return "redirect:/manage/product";
	}

	@ModelAttribute("products")
	public List<Product> getAll() {
		return productDAO.list();
	}

}
