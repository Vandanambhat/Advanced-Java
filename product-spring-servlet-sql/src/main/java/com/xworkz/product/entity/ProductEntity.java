package com.xworkz.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "product_details")
@Entity
public class ProductEntity {
	@Id
	@Column(name = "name")
	private String name;
	@Column(name = "type")
	private String type;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "price")
	private String price;

	public ProductEntity(String name, String type, int quantity, String price) {
		super();
		this.name = name;
		this.type = type;
		this.quantity = quantity;
		this.price = price;
	}

}
