package com.ProductOrderId.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "shoppingTB")
public class Shopping {

	@Id
	@GeneratedValue
	private int productId;
	private int orderId;
	private String productName;
	private String productType;
	private float price;
	private boolean isPlaced;

	@CreationTimestamp
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime createdDateTime;

	@UpdateTimestamp
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime modifiedDateTime;

	public Shopping() {

	}

	public Shopping(int orderId, String productName, String productType, float price, boolean isPlaced,
			LocalDateTime createdDateTime, LocalDateTime modifiedDateTime) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.productType = productType;
		this.price = price;
		this.isPlaced = isPlaced;
		this.createdDateTime = createdDateTime;
		this.modifiedDateTime = modifiedDateTime;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isPlaced() {
		return isPlaced;
	}

	public void setPlaced(boolean isPlaced) {
		this.isPlaced = isPlaced;
	}

	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public LocalDateTime getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(LocalDateTime modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

}
