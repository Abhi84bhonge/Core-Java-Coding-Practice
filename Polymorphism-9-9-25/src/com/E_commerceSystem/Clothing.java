package com.E_commerceSystem;

public class Clothing extends Product {

	
	 private int size;
	 private String color;
	 private String material;
	
	 Clothing(){
		 super();
		 this.color="";
		 this.material="";
	 }
	 
	 Clothing(String name,String description,double price,int size,String color,String material){
		 super(name,description,price);
		 this.size=size;
		 this.color=color;
		 this.material=material;
		 
	 }
	 
	 
	 @Override
	 public void calculateDiscount(String name,String description,double price,int size,String color) {
		 double discount;
			if("Denim".equalsIgnoreCase(name)) {
			    System.out.println("Product name "+name);
			    System.out.println("Description of Product "+description);
				System.out.println("Price of Product "+price);
				System.out.println("Size of Product "+this.size);
				System.out.println("Color of Product "+this.color );
		        System.out.println("Material "+this.material);
				if (price > 200) {
				discount=price*15/100;
				System.out.println("15% Discount Rs. " + discount);
				price=price-discount;
				System.out.println("After Discount Product RS. "+price);
				System.out.println("+++++++++++++++++++++++++++++++++++++");
			} else if (price > 1000) {
				discount = price * 20 / 100;
				System.out.println("20% Discount Rs. " + discount);
				System.out.println("After Discount Product RS. "+price);
				System.out.println("+++++++++++++++++++++++++++++++++++++");
				price=price-discount;
			} else if (price > 5000) {
				discount = price * 25 / 100;
				System.out.println("25% Discount Rs. " + discount);
				price=price-discount;
				System.out.println("After Discount Product RS. "+price);
				System.out.println("+++++++++++++++++++++++++++++++++++++");
			
			}
			
			}
			
			else {
				System.out.println("!!--Sorry No Discount--!!");
			}
			
		}
	 
	 public static void main(String[] args) {
		
		 Product pd=new Product("Denim","100% Cotton",3000);
		  pd.displayProductDetails();
		  pd.calculateDiscount();
		  
		  Clothing ct=new Clothing("Denim","Shirts are 50% Cotton",5000,32,"red","cotton");
		  
		  ct.calculateDiscount("Denim", "50% cotton", 1000,30,"red");
		  ct.calculateDiscount("Denim", "50% cotton", 3000,33,"red");
		 

       
	 }
}
