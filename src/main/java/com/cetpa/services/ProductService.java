package com.cetpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.models.Product;
import com.cetpa.repositories.ProductRepository;

@Service
public class ProductService 
{
	@Autowired private ProductRepository productRepository;

	public void saveProduct(Product product) 
	{
		productRepository.save(product);
	}

	public List<Product> getList() 
	{
		return productRepository.list();
	}
}
