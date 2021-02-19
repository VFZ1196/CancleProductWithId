package com.ProductOrderId.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.ProductOrderId.model.Shopping;
import com.ProductOrderId.repository.ShoppingRepository;

@Service
public class ShoppingService {

	@Autowired
	private ShoppingRepository shoppingRepository;

	public ResponseEntity<Shopping> updateCart(@PathVariable int productId, @PathVariable Integer id) throws Exception {

		Shopping shopping = shoppingRepository.findById(productId).get();

		if (id.equals(shopping.getOrderId())) {

			if (shopping.isPlaced() == true) {

				shopping.setPlaced(false);

				System.out.println("Order id " + shopping.getOrderId() + " Canclled");
			}
		}
		Shopping update = shoppingRepository.save(shopping);

		return ResponseEntity.ok(update);
	}
}

