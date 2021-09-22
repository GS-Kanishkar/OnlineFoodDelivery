package com.sprintaws.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="foodcart_master")
public class FoodCart 
{
	private String cartId;
	Customer customer;
	List<Item> itemList;
	
	public String getCartId()
	{
		return cartId;
	}
	public void setCartId(String cartId) 
	{
		this.cartId = cartId;
	}
	public Customer getCustomer() 
	{
		return customer;
	}
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	public List<Item> getItemList() 
	{
		return itemList;
	}
	public void setItemList(List<Item> itemList)
	{
		this.itemList = itemList;
	}
	
}
