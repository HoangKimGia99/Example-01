package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.demo.model.Category;
import com.spring.demo.model.Product;

import com.spring.demo.service.CategoryService;
import com.spring.demo.service.ProductService;

@Controller
@RequestMapping(value = "/")
@Transactional
public class HomeController {
	private ProductService productService;
	private CategoryService categoryService;
	
	@Autowired(required = true)
	@Qualifier(value = "productService")
	public void setProductService(ProductService ps) {
		this.productService = ps;
	}
	
	@Autowired(required = true)
	@Qualifier(value = "categoryService")
	public void setCategoryService(CategoryService cs) {
		this.categoryService = cs;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String listProducts(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("category", new Category());
		//product
	    model.addAttribute("getProductHotnew", this.productService.getProductHotnew());
	    
	    //category
	    model.addAttribute("getCategory", this.categoryService.getCategory());
		return "home/home";
	}
	

}
