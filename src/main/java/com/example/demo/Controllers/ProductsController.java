package com.example.demo.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Pojos.Product;
import com.example.demo.Pojos.ProductView;
import com.example.demo.Services.ProductService;

@RestController
@RequestMapping("products")
public class ProductsController {
	
	@Autowired
	private ProductService ps;
	
	@PostMapping("add")
	public Product addProduct(@RequestBody Product newProduct) {
		return ps.addProduct(newProduct);
	}
	
	@GetMapping("all")
	public List<ProductView> getAllProducts(){
		return this.ps.getAllProducts();
	}
	
	@DeleteMapping("delete/{id}")
	public boolean deleteProduct(@PathVariable("id") int id) {
		return this.ps.deleteProduct(id);
	}
	
}
