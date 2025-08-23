package mypackage;
import java.util.Scanner;

class movieticket {
 String moviename;
 int ticketcount;
 String seattype;
 int perpriceticket;
 
 movieticket(String moviename, int ticketcount){
  this(moviename, ticketcount, "Normal");
 }
 
 movieticket(String moviename, int ticketcount, String seattype){
  this.moviename=moviename;
  this.ticketcount=ticketcount;
  this.seattype=seattype;
  
  if(seattype.equalsIgnoreCase("Normal"))
  {
   perpriceticket=150;
  }
  else if(seattype.equalsIgnoreCase("VIP"))
  {
   perpriceticket=300;
  }
  
 }
 
  void displayBooking() {
         if (perpriceticket > 0) {
             int totalPrice = ticketcount * perpriceticket;
             System.out.println("Movie: " + moviename);
             System.out.println("Tickets: " + ticketcount);
             System.out.println("Seat Type: " + seattype);
             System.out.println("Total Price: ₹" + totalPrice);
         } else {
             System.out.println("Invalid seat type entered.");
         }
     }
}

public class Movie_Booking {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of tickets: ");
        int count = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter seat type (Normal/VIP) or press Enter for Normal: ");
        String seatType = sc.nextLine();

        movieticket ticket;

        // If seat type is empty, call the 2-parameter constructor
        if (seatType.isEmpty()) {
            ticket = new movieticket(name, count);
        } else {
            ticket = new movieticket(name, count, seatType);
        }

        ticket.displayBooking();
        sc.close();

 }

}