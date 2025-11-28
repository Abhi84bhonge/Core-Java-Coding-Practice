package com.E_commerceSystem;

public class Product {
 
	private String name;
	private String description ;
	private double price;
	
	Product(){
		this.name="";
		this.description="";
	}
	
	Product(String name,String description,double price){
		this.name=name;
		this.description=description;
		this.price=price;
	}
	
		public void calculateDiscount() {
	    double discount;
	    if (price > 5000) {                   
	        discount = price * 20 / 100;
	        price = price - discount;
	        System.out.println("20% Discount Rs. " + discount);
	    } else if (price > 1000) {            
	        discount = price * 15 / 100;
	        price = price - discount;
	        System.out.println("15% Discount Rs. " + discount);
	    } else if (price > 200) {               
	        discount = price * 10 / 100;
	        price = price - discount;
	        System.out.println("10% Discount Rs. " + discount);
	    } else {
	        System.out.println("Sorry, no discount");
	    }
	    System.out.println("After Discount Product RS. " + price);
	    System.out.println("+++++++++++++++++++++++++++++++++++++");
	}

	
	
	
//	Electronics Method
	public void calculateDiscount(String name,double price) {
	    
	    calculateDiscount();
		}
	
	public void calculateDiscount(double price,String name) {
	    calculateDiscount();	
	}
	
	
//	Clothing Method
	public void calculateDiscount(String name,String description,double price,int size,String color) {
	    calculateDiscount();	
	}
	
	
	
	
	
	public void displayProductDetails() {
		
		System.out.println("Product Name "+name);
		System.out.println("Product Description "+description);
		System.out.println("Product Price Rieal Price "+price);
		
		
		
	}
}
