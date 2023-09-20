package com.cetpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetpa.models.Product;
import com.cetpa.services.ProductService;

@Controller
@RequestMapping("product")
public class ProductController 
{
	@Autowired private ProductService productService;
	@RequestMapping("")
	public String getHomeView()
	{
		return "home";
	}
	@RequestMapping("insert-record")
	public String getInsertView()
	{
		return "insert";
	}
	@RequestMapping("save-record")
	public String saveProductRecord(Product product)
	{
		productService.saveProduct(product);
		return "save";
	}
	@RequestMapping("product-list")
	public String getProductList(Model model)
	{
		List<Product> productList=productService.getList();
		model.addAttribute("plist",productList);
		return "list";
	}
}
