package com.Criteria;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Automobile {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String model;
	private String brand;
	private double price;
	
	
	@Override
	public String toString() {
		return "Automobile [id=" + id + ", model=" + model + ", brand=" + brand + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
