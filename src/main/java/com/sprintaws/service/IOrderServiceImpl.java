package com.sprintaws.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprintaws.dao.IOrderRepository;
import com.sprintaws.entity.Customer;
import com.sprintaws.entity.OrderDetails;
import com.sprintaws.entity.Restaurant;


@Service
public class IOrderServiceImpl implements IOrderService
{
	@Autowired
	private IOrderRepository repository;

	@Override
	public OrderDetails addOrder(OrderDetails order) {
		
		return repository.save(order);
	}

	
	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		OrderDetails ord =repository.findById(order.getOrderId()).orElseThrow(
				() -> new EntityNotFoundException("no order found by the id"));
		ord.setOrderStatus(order.getOrderStatus());
		return repository.save(ord); 
	}
	
//	@Override
//	public User findUserById(int id) {
//		User user = dao.findUserById(id);
//		return user;
//	}

	@Override
	public OrderDetails removeOrder(OrderDetails order) {
		
		 
		return repository.delete(order);;
	}

	@Override
	public OrderDetails viewOrder(OrderDetails order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDetails> viewAllOrders(Restaurant res) {
		return repository.findAll();
	}

	@Override
	public List<OrderDetails> viewAllOrders(Customer customer) {
		return repository.findAll();
	}
	
}
