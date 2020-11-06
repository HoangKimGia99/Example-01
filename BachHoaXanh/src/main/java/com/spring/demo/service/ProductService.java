package com.spring.demo.service;

import java.util.List;

import com.spring.demo.model.Product;

public interface ProductService {
	public List<Product> getProductHotnew();
	public List<Product> getProduct();
	public Product getProductById(int id);
	public void addProduct(Product p);

	public void updateProduct(Product p);

	public List<Product> listProducts();

	public void removeProduct(int id);


}