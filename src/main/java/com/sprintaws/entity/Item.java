package com.sprintaws.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="item_master")
public class Item 
{
	private String itemId;
	private String itemName;
	Category category;
	private int quantity;
	private double cost;
	List<Restaurant> restaurant;
	
	public String getItemId()
	{
		return itemId;
	}
	public void setItemId(String itemId) 
	{
		this.itemId = itemId;
	}
	public String getItemName()
	{
		return itemName;
	}
	public void setItemName(String itemName) 
	{
		this.itemName = itemName;
	}
	public Category getCategory() 
	{
		return category;
	}
	public void setCategory(Category category)
	{
		this.category = category;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	public double getCost() 
	{
		return cost;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	public List<Restaurant> getRestaurant() 
	{
		return restaurant;
	}
	public void setRestaurant(List<Restaurant> restaurant) 
	{
		this.restaurant = restaurant;
	}
	
}
