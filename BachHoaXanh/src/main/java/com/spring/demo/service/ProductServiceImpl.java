package com.spring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.demo.dao.ProductDAO;
import com.spring.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDAO;

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;

	}
	@Transactional
	public List<Product> getProductHotnew() {
		return this.productDAO.getProductHotnew();
	}
	@Transactional
	public List<Product> getProduct() {
		return this.productDAO.getProduct();
	}
	@Transactional
	public Product getProductById(int id) {
		return this.productDAO.getProductById(id);
	}
	@Transactional
	public void addProduct(Product p) {
		this.productDAO.addProduct(p);
	}

	@Transactional
	public void updateProduct(Product p) {
		this.productDAO.updateProduct(p);
	}

	@Transactional
	public List<Product> listProducts() {
		return this.productDAO.listProducts();
	}
	@Transactional
	public void removeProduct(int id) {
		this.productDAO.removeProduct(id);
	}
}
