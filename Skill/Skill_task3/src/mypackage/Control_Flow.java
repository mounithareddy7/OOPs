package mypackage;

public class Control_Flow {

	public static void main(String[] args) {
		 int age = 18;
	        if (age >= 18) {
	            System.out.println("You are eligible to vote.");
	        } else {
	            System.out.println("Not eligible to vote.");
	        }
	        
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Count: " + i);
	        }
	        
	        int num = 3;
	        while (num > 0) {
	            System.out.println("Number: " + num);
	            num--;
	        }
	}

}
