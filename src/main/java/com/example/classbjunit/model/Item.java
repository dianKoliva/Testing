package com.example.classbjunit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Item {

	public Item(int id, String name, int price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}


	@Id
	private int id;
	
	private String name;
	
	private int price;

	@Transient
	private final int total=this.price*this.quantity;
	private  int quantity;

	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal() {
		return total;
	}


}
