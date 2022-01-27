package com.xworkz.product.dao;

import java.util.List;

import com.xworkz.product.entity.ProductEntity;

public interface ProductDAO {

	void save(ProductEntity entity);
	
	void saveAll(List<ProductEntity> entities);
	
	List<ProductEntity> getAll();
	
	ProductEntity getByPriceGreaterThan(double price);
	
	ProductEntity getByPriceLesserThan(double price);
	
	ProductEntity getByNameAndId(String name,int id);
	
	ProductEntity getTotal();
	
	getMaxPrice();
	
	getTotalPrice();
	
	getByNameLike(String like);
	
	getQuantityByName(String name);
	
	getQuantityAndPriceByName(String name);
	
	getQuantityAndPriceByNameAndId(String name, int id);
	
	getByBrand(String brand);
	
	getBrandByName(String name);
	
	getNameAndPrice();
	
	getNameAndPriceByBrand(String brand);
	
}
