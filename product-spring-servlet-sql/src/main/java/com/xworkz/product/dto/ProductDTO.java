package com.xworkz.product.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDTO {

	private int id;
	private String name;
	private String type;
	private int quantity;
	private String price;
}
