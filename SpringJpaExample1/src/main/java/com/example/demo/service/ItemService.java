package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;

@Component
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}
	
	public Item getItemById(Long id) {
		return itemRepository.getOne(id);
	}
	
	public Item getItemByName(String itemName) {
		return itemRepository.getItemByName(itemName);
	}
	
	public List<Item> getItemByNameOrderByItemCondition(String itemName) {
		return itemRepository.getItemByNameOrderByItemCondition(itemName);
	}
	
	public List<Item> getItemByNameOrderByItemConditionDesc(String itemName) {
		return itemRepository.getItemByNameOrderByItemConditionDesc(itemName);
	}
}
