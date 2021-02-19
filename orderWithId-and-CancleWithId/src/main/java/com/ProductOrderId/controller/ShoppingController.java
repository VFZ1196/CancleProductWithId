package com.ProductOrderId.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProductOrderId.model.Shopping;
import com.ProductOrderId.repository.ShoppingRepository;
import com.ProductOrderId.service.ShoppingService;

@RestController
public class ShoppingController {

	@Autowired
	private ShoppingService shoppingService;

	@Autowired
	private ShoppingRepository shoppingRepository;

	@PostMapping("/shopping")
	public Shopping addProduct(@RequestBody Shopping shopping) {
		return shoppingRepository.save(shopping);
	}

	@GetMapping("/shopping")
	public List<Shopping> getAll() {
		return shoppingRepository.findAll();
	}

	@GetMapping("/shopping/{id}")
	public Shopping getOne(@PathVariable int id) {
		return shoppingRepository.findById(id).get();
	}

	@PutMapping("/shopping/{productId}/{id}")
	public ResponseEntity<Shopping> updateCart(@PathVariable int productId, @PathVariable int id) throws Exception {
		return shoppingService.updateCart(productId, id);
	}

}
