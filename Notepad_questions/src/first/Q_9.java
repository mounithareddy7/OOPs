package first;
import java.util.Scanner;
public class Q_9 {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 
    	 System.out.print("Enter a value:");
    	 int a=sc.nextInt();
    	 
    	 System.out.print("Enter b value:");
    	 int b=sc.nextInt();
    	 
    	 System.out.println("\nBitwise Operations:");
    	 
    	  System.out.println("a & b = " + (a & b) + " (Binary: " + Integer.toBinaryString(a & b) + ")");
          System.out.println("a | b = " + (a | b) + " (Binary: " + Integer.toBinaryString(a | b) + ")");
          System.out.println("a ^ b = " + (a ^ b) + " (Binary: " + Integer.toBinaryString(a ^ b) + ")");
          System.out.println("a << 1 = " + (a << 1) + " (Binary: " + Integer.toBinaryString(a << 1) + ")");
          System.out.println("b >> 1 = " + (b >> 1) + " (Binary: " + Integer.toBinaryString(b >> 1) + ")");
 
     }
}
