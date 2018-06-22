package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;

@SpringBootApplication
@RestController
@RequestMapping(value = "/items", consumes = "application/json", produces = "application/json")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@GetMapping(path = "/items")
	public List<Item> getAllItems() {
		return itemService.getAllItems();
	}

	@GetMapping(path = "/items/{itemId}")
	public Item getItemById(@PathVariable final Long itemId) {
		return itemService.getItemById(itemId);
	}
	
	@GetMapping(path = "/name/{itemName}")
	public Item getItemByName(@PathVariable final String itemName) {
		return itemService.getItemByName(itemName);
	}
	
	@GetMapping(path = "/Ordername/{itemName}")
	public List<Item> getItemByNameOrderByItemCondition(@PathVariable final String itemName) {
		return itemService.getItemByNameOrderByItemCondition(itemName);
	}
}
