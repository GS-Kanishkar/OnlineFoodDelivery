package com.sprintaws.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sprintaws.entity.OrderDetails;

public interface IorderRepository extends JpaRepository<OrderDetails,String>{

}
