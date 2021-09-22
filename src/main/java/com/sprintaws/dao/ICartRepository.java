package com.sprintaws.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintaws.entity.FoodCart;

public interface ICartRepository extends JpaRepository<FoodCart,Integer> {

}
