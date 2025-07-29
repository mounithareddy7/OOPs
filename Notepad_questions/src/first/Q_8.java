package first;
import java.util.Scanner;
public class Q_8 {
      public static void main(String[] args) {
    	  Scanner sc= new Scanner(System.in);
    	  
    	  System.out.print("Enter a value:");
    	  int a=sc.nextInt();
    	  
    	  System.out.print("Enter b value:");
    	  int b=sc.nextInt();
    	  
    	 //SUM
    	 int sum=a+b;
    	 int sub=a-b;
    	 int mul=a*b;
    	 double div=a/b;
    	 
    	 System.out.println("Sum="+sum);
    	 
    	 System.out.println("Difference="+sub);
    	 
    	 
    	 System.out.println("Product="+mul);
    	 
    	 
    	 System.out.println("Division="+div);
      }
}
