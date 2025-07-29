package mypackage;
import java.util.Arrays;

public class Array_Sort {
	public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3};

        Arrays.sort(arr); // built-in sort

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


