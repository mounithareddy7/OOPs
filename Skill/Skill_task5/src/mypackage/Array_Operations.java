package mypackage;

public class Array_Operations {

	public static void main(String[] args) {
		 int[] numbers = {10, 20, 30};
	        for (int num : numbers) {
	            System.out.println(num);
	        }
	        
	        int[][] matrix = {
	                {1, 2, 3},
	                {4, 5, 6}
	            };
	            for (int i = 0; i < 2; i++) {
	                for (int j = 0; j < 3; j++) {
	                    System.out.print(matrix[i][j] + " ");
	                }
	                System.out.println();
	            }
	            
	            int[] arr = {5, 10, 15};
	            int sum = 0;
	            for (int n : arr) {
	                sum += n;
	            }
	            System.out.println("Sum: " + sum);


	}

}
