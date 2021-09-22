package com.sprintaws.entity;

import java.util.List;

public class Restaurant 
{
	private String restaurantId;
	private String restaurantName;
	Address address;
	List<Item> itemList;
	private String managerName;
	private String contactNumber;
	
	public String getRestaurantId()
	{
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId)
	{
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() 
	{
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) 
	{
		this.restaurantName = restaurantName;
	}
	public Address getAddress() 
	{
		return address;
	}
	public void setAddress(Address address) 
	{
		this.address = address;
	}
	public List<Item> getItemList() 
	{
		return itemList;
	}
	public void setItemList(List<Item> itemList)
	{
		this.itemList = itemList;
	}
	public String getManagerName()
{
		return managerName;
	}
	public void setManagerName(String managerName)
	{
		this.managerName = managerName;
	}
	public String getContactNumber() 
	{
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) 
	{
		this.contactNumber = contactNumber;
	}
}
