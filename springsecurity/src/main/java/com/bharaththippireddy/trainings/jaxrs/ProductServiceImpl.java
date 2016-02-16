package com.bharaththippireddy.trainings.jaxrs;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

	List<Product> products = new ArrayList<Product>();
	private int productId = 123; // product Id starting in 123

	public ProductServiceImpl() {
		Product product = new Product();
		product.setId(++productId);
		product.setDescription("Java Web Services Course!");
		products.add(product);
	}

	@Override
	public List<Product> getProducts() {
		return products;
	}

	@Override
	public int addProduct(Product product) {
		product.setId(++productId); // every time we call addProduct productId is incremented
		products.add(product);// we added to the global product 
		return productId; // and return the current value
	}

}
