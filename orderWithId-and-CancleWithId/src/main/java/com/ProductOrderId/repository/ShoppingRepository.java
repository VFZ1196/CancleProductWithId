package com.ProductOrderId.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ProductOrderId.model.Shopping;
@Repository
public interface ShoppingRepository extends JpaRepository<Shopping, Integer>{

}
