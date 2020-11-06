package com.spring.demo.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.demo.model.Product;

@Transactional
@Repository
public class ProductDAOImpl implements ProductDAO {
	private static final Logger logger = LoggerFactory.getLogger(ProductDAOImpl.class);
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	public void addProduct(Product p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(p);
		logger.info("Product saved successfully, Product Details=" + p);
	}

	public void updateProduct(Product p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Product updated successfully, Product Details=" + p);
	}
	@SuppressWarnings("deprecation")
	public void removeProduct(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Product p = (Product) session.load(Product.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
		logger.info("Product deleted successfully, product details=" + p);
	}
	@SuppressWarnings("unchecked")
	public List<Product> listProducts() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Product> productsList = session.createQuery("from Product").list();
		for (Product p : productsList) {
			logger.info("Product List::" + p);
		}
		return productsList;
	}
	@SuppressWarnings("unchecked")
	public List<Product> getProductHotnew() {
		Session session = this.sessionFactory.getCurrentSession();

		List<Product> productsList = session.createQuery("from Product where cover = true and hot_new = true   ").list();
		for (Product p : productsList) {
			logger.info("Product List::" + p);
		}
		return productsList;
	}
	@SuppressWarnings("unchecked")
	public List<Product> getProduct() {
		Session session = this.sessionFactory.getCurrentSession();

		List<Product> productsList = session.createQuery("from Product where cover = true and id_category = id  ").list();
		for (Product p : productsList) {
			logger.info("Product List::" + p);
		}
		return productsList;
	}
	@SuppressWarnings("deprecation")
	public Product getProductById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Product p = (Product) session.load(Product.class, new Integer(id));
		logger.info("Product loaded successfully, Product details=" + p);
		return p;
	}

}