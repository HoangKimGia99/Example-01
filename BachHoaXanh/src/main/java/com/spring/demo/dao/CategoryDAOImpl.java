package com.spring.demo.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.demo.model.Category;

@Transactional
@Repository
public class CategoryDAOImpl implements CategoryDAO {
	private static final Logger logger = LoggerFactory.getLogger(CategoryDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@SuppressWarnings("unchecked")
	public List<Category> getCategory() {
		Session session = this.sessionFactory.getCurrentSession();

		List<Category> categorysList = session.createQuery("from Category where popular = true").list();
		for (Category p : categorysList) {
			logger.info("Category List::" + p);
		}
		return categorysList;
	}
	
	@SuppressWarnings("deprecation")
	public Category getCategoryById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Category p = (Category) session.load(Category.class, new Integer(id));
		logger.info("Category loaded successfully, Category details=" + p);
		return p;
	}

}