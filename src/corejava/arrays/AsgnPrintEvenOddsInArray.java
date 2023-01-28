package corejava.arrays;
import java.util.Scanner;

public class AsgnPrintEvenOddsInArray {
	/*
	 * Print odd evens in an array
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int i=0 ;
		
		System.out.println("Enter array elements : ");
		// Loop to scan input elements
		while(i<arr.length) {
			arr[i] = sc.nextInt();
			i++;
		}
		
		System.out.println("Your array is :");
		// Loop to print elements
		for(int j:arr) {
			System.out.print(j+" ");
		}
		
		System.out.println("\nEven numbers in your array -");
		// Loop to print even numbers
		for(int x:arr) {
			if(x%2==0)
				System.out.print(x+" ");
		}
		
		System.out.println("\nOdd numbers in your array -");
		// Loop to print odd numbers
		for(int x:arr) {
			if(x%2!=0)
				System.out.print(x+" ");
		}	
	}

}
