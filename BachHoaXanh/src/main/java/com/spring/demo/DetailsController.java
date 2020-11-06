package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.demo.service.ProductService;

	@Controller
	@Transactional
	public class DetailsController {
		private ProductService productService;

		@Autowired(required = true)
		@Qualifier(value = "productService")
		public void setProductService(ProductService ps) {
			this.productService = ps;
		}
		@RequestMapping("/product/{id}")
		public String editCustomer(@PathVariable("id") int id, Model model) {
			model.addAttribute("product", this.productService.getProductById(id));
			
			return "shop/shop-details";
		}
		
	}

