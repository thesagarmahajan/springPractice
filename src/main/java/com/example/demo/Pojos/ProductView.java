package com.example.demo.Pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Immutable;

@Entity
@Immutable
@Table(name="productview")
public class ProductView {
	@Id
	Integer id;
	
	String product_name;
	
	String product_details;
	
	Integer product_price;
	
	Date created_on;

	public Integer getId() {
		return id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public String getProduct_details() {
		return product_details;
	}

	public Integer getProduct_price() {
		return product_price;
	}

	public Date getCreated_on() {
		return created_on;
	}
	
	
}
