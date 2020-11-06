package com.spring.demo.dao;

import java.util.List;
import com.spring.demo.model.Category;

public interface CategoryDAO {

public List<Category> getCategory();

public Category getCategoryById(int id);

}