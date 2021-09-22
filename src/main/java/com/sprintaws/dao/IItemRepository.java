package com.sprintaws.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprintaws.entity.Item;


public interface IItemRepository extends JpaRepository<Item,Integer> {

}
