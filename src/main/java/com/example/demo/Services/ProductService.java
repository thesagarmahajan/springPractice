package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.Pojos.Product;
import com.example.demo.Pojos.ProductView;
import com.example.demo.dao.ProductDao;
import com.example.demo.dao.ProductViewDao;

@Service
public class ProductService{
	
	
	private ProductDao pd;
	private ProductViewDao  pvd;
	
	
	@Autowired
	public ProductService(ProductDao pd, ProductViewDao productViewDao) {
		super();
		this.pd = pd;
		this.pvd = productViewDao;
	}

	public Product addProduct(Product newProduct) {
		return this.pd.save(newProduct);
	}
	
	public List<ProductView> getAllProducts(){
		return this.pvd.findAll();
	}
	
	public boolean deleteProduct(int id) {
		try {
			this.pd.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
}
