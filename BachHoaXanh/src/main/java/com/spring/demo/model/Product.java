package com.spring.demo.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations Hibernate provides JPA implementation
 */
@Entity
@Table(name = "PRODUCT")
public class Product {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "price")
	private double price;
	@Column(name = "price_net")
	private double price_net;
	@Column(name = "available")
	private int available;
	@Column(name = "sold")
	private int sold;
	@Column(name = "deal_timer")
	private Timestamp deal_timer;
	@Column(name = "discount")
	private int discount;
	@Column(name = "image")
	private String image;
	@Column(name = "cover")
	private boolean cover;
	@Column(name = "hot_deal")
	private boolean hot_deal;
	@Column(name = "hot_new")
	private boolean hot_new;
	@Column(name = "hot_best")
	private boolean hot_best;
	@Column(name = "trend")
	private boolean trend;
	@Column(name = "latest_review")
	private boolean latest_review;
	@Column(name = "id_category")
	private int id_category;
	public Product() {
	  }
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice_net() {
		return price_net;
	}

	public void setPrice_net(double price_net) {
		this.price_net = price_net;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	public Timestamp getDeal_timer() {
		return deal_timer;
	}

	public void setDeal_timer(Timestamp deal_timer) {
		this.deal_timer = deal_timer;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean getCover() {
		return cover;
	}

	public void setCover(boolean cover) {
		this.cover = cover;
	}

	public boolean getHot_deal() {
		return hot_deal;
	}

	public void setHot_deal(boolean hot_deal) {
		this.hot_deal = hot_deal;
	}

	public boolean getHot_new() {
		return hot_new;
	}

	public void setHot_new(boolean hot_new) {
		this.hot_new = hot_new;
	}

	public boolean getHot_best() {
		return hot_best;
	}

	public void setHot_best(boolean hot_best) {
		this.hot_best = hot_best;
	}

	public boolean getTrend() {
		return trend;
	}

	public void setTrend(boolean trend) {
		this.trend = trend;
	}

	public boolean getLatest_review() {
		return latest_review;
	}

	public void setLatest_review(boolean latest_review) {
		this.latest_review = latest_review;
	}

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price + ", price_net=" + price_net + ", available=" + available + ", sold=" + sold + ", deal_timer=" + deal_timer + ", discount=" + discount + ", image=" + image + ", cover=" + cover + ", hot_deal=" + hot_deal + ", hot_new=" + hot_new + ", hot_best=" + hot_best + ", trend=" + trend + ", latest_review=" + latest_review + ", id_category=" + id_category + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
