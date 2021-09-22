package com.sprintaws.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="category_master")
public class Category
{
	private String catId;
	private String categoryName;
	
	public String getCatId() 
	{
		return catId;
	}
	public void setCatId(String catId)
	{
		this.catId = catId;
	}
	public String getCategoryName()
	{
		return categoryName;
	}
	public void setCategoryName(String categoryName)
	{
		this.categoryName = categoryName;
	}
}
