package com.museum.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name="article_name")
	private String name;
	
	
	@Column(name="article_category")
	@Enumerated(EnumType.STRING)
	private Category category;
	
	
	private Date createDate;
	
	private String createdName;
	
	
	public Article() {
		// TODO Auto-generated constructor stub
	}


	public Article(Integer id, String name, Category category, Date createDate, String createdName) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.createDate = createDate;
		this.createdName = createdName;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public String getCreatedName() {
		return createdName;
	}


	public void setCreatedName(String createdName) {
		this.createdName = createdName;
	}


	@Override
	public String toString() {
		return "Article [id=" + id + ", name=" + name + ", category=" + category + ", createDate=" + createDate
				+ ", createdName=" + createdName + "]";
	}
	
	
	
}
