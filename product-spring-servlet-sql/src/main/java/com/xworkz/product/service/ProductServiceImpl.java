package com.xworkz.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.repository.ProductRepository;

@Component
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repository;

	public ProductServiceImpl(ProductRepository repository) {
		this.repository = repository;
	}

	@Override
	public boolean validateAndSave(ProductEntity entity) {
		boolean valid = true;

		if ((entity.getName() != null && !(entity.getName().isEmpty()) && entity.getName().length() > 3
				&& entity.getName().length() < 30)) {
			valid = true;

		} else {
			System.out.println("Invalid product name");
			valid = false;
			return valid;
		}
		if (entity.getType() != null && !(entity.getType().isEmpty()) && entity.getType().length() > 3
				&& entity.getType().length() < 100) {
			valid = true;

		} else {
			System.out.println("Invalid product type");
			valid = false;
			return valid;
		}
		if (entity.getPrice() != null && !(entity.getPrice().isEmpty()) && entity.getPrice().length() > 3
				&& entity.getPrice().length() < 100) {
			valid = true;

		} else {
			System.out.println("Enter the valid price");
			valid = false;
			return valid;
		}
		if (entity.getQuantity() != 0) {
			valid = true;
		} else {
			System.out.println("Invalid  Quantity type");
			valid = false;
			return valid;

		}
		if (valid) {
			repository.save(entity);
		}

		return false;
	}
}
