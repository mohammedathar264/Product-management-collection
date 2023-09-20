package com.cetpa.repositories;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.cetpa.models.Product;

@Repository
public class ProductRepository 
{
	private Map<Integer,Product> map=new HashMap<Integer,Product>();

	public void save(Product product) 
	{
		map.put(product.getPid(),product);
	}

	public List<Product> list() 
	{
		Collection<Product> c=map.values();
		ArrayList<Product> plist=new ArrayList<Product>(c);
		return plist;
	}
}
