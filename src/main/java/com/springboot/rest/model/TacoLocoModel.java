package com.springboot.rest.model;

public class TacoLocoModel {
	//variables to store quantity of each tacos
	private int quantity_Veggie_Taco;
	private int quantity_Chicken_Taco;
	private int quantity_Beef_Taco;
	private int quantity_Chorizo_Taco;  
	
	public int getQuantity_Veggie_Taco() {
		return quantity_Veggie_Taco;
	}
	public void setQuantity_Veggie_Taco(int quantity_Veggie_Taco) {
		this.quantity_Veggie_Taco = quantity_Veggie_Taco;
	}
	public int getQuantity_Chicken_Taco() {
		return quantity_Chicken_Taco;
	}
	public void setQuantity_Chicken_Taco(int quantity_Chicken_Taco) {
		this.quantity_Chicken_Taco = quantity_Chicken_Taco;
	}
	public int getQuantity_Beef_Taco() {
		return quantity_Beef_Taco;
	}
	public void setQuantity_Beef_Taco(int quantity_Beef_Taco) {
		this.quantity_Beef_Taco = quantity_Beef_Taco;
	}
	public int getQuantity_Chorizo_Taco() {
		return quantity_Chorizo_Taco;
	}
	public void setQuantity_Chorizo_Taco(int quantity_Chorizo_Taco) {
		this.quantity_Chorizo_Taco = quantity_Chorizo_Taco;
	}

	//Cost of each Taco
	private final double Price_of_Veggie_Taco = 2.5;
	private final double Price_of_Chicken_Taco = 3.0;
	private final double Price_of_Beef_Taco = 3.0;
	private final double Price_of_Chorizo_Taco = 3.50;
	  	
	/**
	 * If total orders 4 & above, 20% discount will be given.
	 * Performed calculation to get the final price
	 * @return double final price
	 */
	public double getFinalPrice() {
		
		//get total number of orders
		int totalOrders =  quantity_Veggie_Taco + quantity_Chicken_Taco + quantity_Beef_Taco + quantity_Chorizo_Taco;
	    
		//Multiply quantity of Taco with its respective cost
		double Total_VeggieTaco_Price   = quantity_Veggie_Taco * Price_of_Veggie_Taco;
		double Total_ChickenTaco_Price  = quantity_Chicken_Taco * Price_of_Chicken_Taco;
		double Total_BeefTaco_Price     = quantity_Beef_Taco * Price_of_Beef_Taco;
		double Total_ChorizoTaco_Price  = quantity_Chorizo_Taco * Price_of_Chorizo_Taco;
			 
		//get total cost of all the orders
		double Price_Of_All_Orders = Total_VeggieTaco_Price + Total_ChickenTaco_Price + Total_BeefTaco_Price + Total_ChorizoTaco_Price;
			 
		double Final_Price;
		
		//check if orders are 4 & above
		if(totalOrders >= 4) {
			//20% discount from total orders
			double discount = 20.0/100;
		    Final_Price = Price_Of_All_Orders - (Price_Of_All_Orders * discount);
		}else 
		    Final_Price = Price_Of_All_Orders;
		    return Final_Price;
	    }  
	  
	  }
