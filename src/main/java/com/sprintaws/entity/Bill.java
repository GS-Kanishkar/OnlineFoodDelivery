package com.sprintaws.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="bill_master")

public class Bill
{
	private String billId;
	private LocalDateTime billDate;
	OrderDetails order;
	private int totalItem;
	private double totalCost;
	
	public String getBillId() 
	{
		return billId;
	}
	public void setBillId(String billId) 
	{
		this.billId = billId;
	}
	public LocalDateTime getBillDate() 
	{
		return billDate;
	}
	public void setBillDate(LocalDateTime billDate)
	{
		this.billDate = billDate;
	}
	public OrderDetails getOrder()
	{
		return order;
	}
	public void setOrder(OrderDetails order) 
	{
		this.order = order;
	}
	public int getTotalItem() 
	{
		return totalItem;
	}
	public void setTotalItem(int totalItem)
	{
		this.totalItem = totalItem;
	}
	public double getTotalCost() 
	{
		return totalCost;
	}
	public void setTotalCost(double totalCost) 
	{
		this.totalCost = totalCost;
	}
	
}




