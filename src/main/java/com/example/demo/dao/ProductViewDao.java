package com.example.demo.dao;

import org.aspectj.weaver.tools.Trace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Pojos.Product;
import com.example.demo.Pojos.ProductView;

import antlr.collections.List;
public interface ProductViewDao extends JpaRepository<ProductView, Integer>{
	
	@Override
	@Query("select p from ProductView p")
	java.util.List<ProductView> findAll();
}
