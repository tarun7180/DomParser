package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{
	public Item getItemByName(String name);
	
	public List<Item> getItemByNameOrderByItemCondition(String name);
	
	public List<Item> getItemByNameOrderByItemConditionDesc(String name);
	
	@Query("select i from Item i where i.itemCondition='good'")
	public List<Item> getItemByItemConditionGood();
}
