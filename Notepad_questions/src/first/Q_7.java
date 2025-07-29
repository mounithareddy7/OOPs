package first;
import java.util.Scanner;
public class Q_7 {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 System.out.print("Enter a value:");
    	 int a=sc.nextInt();
    	 
    	 System.out.print("Enter b value:");
    	 int b=sc.nextInt();
    	 
    	 System.out.print("Enter C value:");
    	 int c=sc.nextInt();
    	 
    	 double avg=(a+b+c)/3.0;
    	 
    	 System.out.println("Average:"+avg);
     }
}
