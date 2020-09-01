/* 1) define a class "Order" with:
     enum Type
	{
		BUY,SELL;
	}
	private int quantity;
	private double price;
	private Type type;
    define setter and getter methods for all the fields.
    create 5 objects of this class and stored them inside list.
    using stream api:
    1) count how many orders are for "SELL"
         hint:- use "filter" method of stream to check whether type is SELL and "count" method to count.
    2) calculate sum of all the prices
         hint:- use "mapToDouble" method of stream to convert price of each and every object and "sum" method to calculate 
                       total of all the prices.
    3) calculate sum of all the quantities.
         hint:- use "mapToInt" method of stream to convert qty of each and every object and "sum" method to calculate 
                       total of all the quantities. */

package StreamApi;

import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.List;
enum type
{
	BUY,SELL;
}
class Order
{
	private int quantity;
	private double price;
	private type t;
	
	public Order(int quantity, double price, type t) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.t = t;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public type getT() {
		return t;
	}
	public void setT(type t) {
		this.t = t;
	}
	
	
}

public class first {
	
	public static void main(String[] args) {
		Order o1 = new Order(2, 1000, type.BUY);
		Order o2 = new Order(1, 2000, type.SELL);
		Order o3 = new Order(4, 4000, type.BUY);
		Order o4 = new Order(3, 5000, type.SELL);
		Order o5 = new Order(5, 3000, type.BUY);
		
      List<Order> mylist = new ArrayList<Order>();
      mylist.add(o1);
      mylist.add(o2);
      mylist.add(o3);
      mylist.add(o4);
      mylist.add(o5);
      
      // count how many orders are for "SELL"
      
      int sellOrders =(int)mylist.stream().filter((m)->{if(m.getT()==type.SELL) return true; else return false; }).count();
      System.out.println("number of orders for sell are:" + "\t" + sellOrders);
      
      // calculate sum of all the prices
      double totalPrice =  mylist.stream().mapToDouble( (m) -> { return m.getPrice(); } ).sum();
		System.out.println("Total price = " + totalPrice);
		
		// calculate sum of all the quantities.
		int totalQuantity = mylist.stream().mapToInt( (m) -> { return m.getQuantity(); } ).sum();
		System.out.println("Total quantites = " + totalQuantity);
      
	}

}
