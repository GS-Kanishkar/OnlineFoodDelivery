package com.sprintaws.service;

import java.util.List;

import com.sprintaws.entity.Customer;
import com.sprintaws.entity.OrderDetails;
import com.sprintaws.entity.Restaurant;

public interface IOrderService 
{
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails removeOrder(OrderDetails order);
	public OrderDetails viewOrder(OrderDetails order);
	public List<OrderDetails> viewAllOrders(Restaurant res);
	public List<OrderDetails> viewAllOrders(Customer customer);
}
