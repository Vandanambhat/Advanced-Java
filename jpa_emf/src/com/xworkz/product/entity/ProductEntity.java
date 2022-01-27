package com.xworkz.product.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ProductEntity implements Serializable{

	private int id;
	private String name;
	private int quantity;
	private String brand;
	private float price;
	private float rating;
	
}
