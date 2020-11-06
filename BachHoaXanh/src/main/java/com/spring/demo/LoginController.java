package com.spring.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.demo.model.Product;
import com.spring.demo.model.Users;
import com.spring.demo.service.ProductService;
import com.spring.demo.service.UserService;
 
@Controller
@Transactional
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	public UserService userService;
	private ProductService productService;

	@Autowired(required = true)
	@Qualifier(value = "productService")
	public void setProductService(ProductService ps) {
		this.productService = ps;
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
        logger.info("Request Login.");
        ModelAndView view = new ModelAndView("admin/login");
        Users loginBean = new Users();
        view.addObject("loginBean", loginBean);
        logger.info("Open login page.");
        return view;
    }
 
    /**
     * execute login
     * 
     * @author realtut
     * @param request
     * @param response
     * @param loginBean
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("loginBean") Users loginBean) {
        ModelAndView view = null;
        if (userService.isUsers(loginBean.getUsername(), loginBean.getPassword())) {
            request.setAttribute("loggedInUser", loginBean.getUsername());
            view = new ModelAndView("admin/admin");
        } else {
            request.setAttribute("message", "Invalid ussename or password!");
            view = new ModelAndView("admin/login");
        }
        return view;
    }
    @RequestMapping(value = "/products", method = RequestMethod.GET)
	public String listProducts(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("listProducts", this.productService.listProducts());
		return "admin/product";
	}

//For add and update product both
	@RequestMapping(value = "/product/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product p) {
		if (p.getId() == 0) {
//new product, add it
			this.productService.addProduct(p);
		} else {
//existing product, call update
			this.productService.updateProduct(p);
		}
		return "redirect:/admin/products";
	}

	@RequestMapping("/remove/{id}")
	public String removeProduct(@PathVariable("id") int id) {
		this.productService.removeProduct(id);
		return "redirect:/admin/products";
	}

	@RequestMapping("/edit/{id}")
	public String editProduct(@PathVariable("id") int id, Model model) {
		model.addAttribute("product", this.productService.getProductById(id));
		model.addAttribute("listProducts", this.productService.listProducts());
		return "admin/product";
	}
}