package first;
import java.util.Scanner;

public class Q_4 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a decimal number: ");
	        double doubleVal = sc.nextDouble();

	        int intVal = (int) doubleVal;

	        System.out.println("Double value : " + doubleVal);
	        System.out.println("Int value    : " + intVal);
	    }
}
