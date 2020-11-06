package com.spring.demo.service;

import java.util.List;

import com.spring.demo.model.Category;

public interface CategoryService {
	public List<Category> getCategory();
	
	public Category getCategoryById(int id);
}
