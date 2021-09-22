package com.sprintaws.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sprintaws.entity.Restaurant;

public interface IRestaurantRepository extends JpaRepository<Restaurant,Integer> {

}
