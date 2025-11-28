package com.E_commerceSystem;

public class Electronics extends Product {

	private int warrantyPeriod;
	private String brand;

	Electronics() {
		super();
		this.brand = "";
      
	}

	Electronics(String name, String description, double price, int warrantyPeriod, String brand) {
		super(name, description, price);
		this.warrantyPeriod = warrantyPeriod;
		this.brand = brand;
		
		
	}
	
	
	
	

	@Override
	public void calculateDiscount(String name,double price) {
		double discount;
		if("bajaj".equalsIgnoreCase(name)) {
			
			System.out.println("Brand Name :"+brand);
			System.out.println("Price of Product "+price);
			System.out.println("Warranty on this Product "+warrantyPeriod+" Years");
		
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
	
	   @Override
		public void calculateDiscount(double price,String name) {
		   double discount;
			if("wipro".equalsIgnoreCase(name)) {
				System.out.println("Brand Name :"+brand);
				System.out.println("Price of Product "+price);
			
				System.out.println("Warranty on this Product "+warrantyPeriod+" Years");
			
				if (price > 200) {
				discount=price*20/100;
				System.out.println("15% Discount Rs. " + discount);
				price=price-discount;
				System.out.println("After Discount Product RS. "+price);
				System.out.println("+++++++++++++++++++++++++++++++++++++");
			} else if (price > 1000) {
				discount = price * 25 / 100;
				System.out.println("20% Discount Rs. " + discount);
				System.out.println("After Discount Product RS. "+price);
				System.out.println("+++++++++++++++++++++++++++++++++++++");
				price=price-discount;
			} else if (price > 5000) {
				discount = price * 30 / 100;
				System.out.println("25% Discount Rs. " + discount);
				price=price-discount;
				System.out.println("After Discount Product RS. "+price);
				System.out.println("+++++++++++++++++++++++++++++++++++++");
			
			} else {
				System.out.println("!!--Sorry No Discount--!!");
			}
			}
			else {
				System.out.println("!!--Sorry No Discount--!!");
			}
			
			
			
	   }
	
	
		
		
 
	public static void main(String[] args) {
		
	    Product pd=new Product("Bajaj","Good Quality",1000);
	    pd.displayProductDetails();
		pd.calculateDiscount();
	    pd.displayProductDetails();
	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
	   Electronics etc=new Electronics("Wipro","good qulaity 200w battery",3000,2,"Wipro");
	  
	    etc.calculateDiscount(1000, "wipro");
	    etc.calculateDiscount(2000, "wipro");
	    Electronics etc1=new Electronics("Bajaj","good qulaity 300w battery",5000,4,"Bajaj");
	    etc1.calculateDiscount("bajaj", 1000);
	    
	}
}
