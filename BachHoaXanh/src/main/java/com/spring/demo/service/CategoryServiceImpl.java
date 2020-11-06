package com.spring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.demo.dao.CategoryDAO;
import com.spring.demo.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDAO categoryDAO;

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;

	}

	@Transactional
	public List<Category> getCategory() {
		return this.categoryDAO.getCategory();
	}
	
	@Transactional
	public Category getCategoryById(int id) {
		return this.categoryDAO.getCategoryById(id);
	}


}
