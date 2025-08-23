package mypackage;

import java.util.Scanner;

class coffeeorder{
 String size;
 int price;
 
 coffeeorder(String size) {
  
  this.size=size;
  
  if(size.equalsIgnoreCase("Small")) 
  {
   this.price=50;
  }
  else if(size.equalsIgnoreCase("Medium")) 
  {
   this.price=70;
  }
  else if(size.equalsIgnoreCase("Large"))
  {
   this.price=90;
   
  }
  else 
  {
   this.price=0;
  }
 }
 
 void displayorder() {
  if(price>0) {
   System.out.println("Coffee size: " +size);
   System.out.println("price: " +price);
  }
  else
  {
   System.out.println("Invalid option");
  }
 }
}

public class coffee_order {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter coffee size: (small/large/medium): ");
  String size = sc.nextLine();
  
  coffeeorder order = new coffeeorder(size);
  order.displayorder();
  
  sc.close();
  

 }

}