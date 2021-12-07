package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Pojos.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	@Override
	@Query("select p from Product p")
	List<Product> findAll();
}
