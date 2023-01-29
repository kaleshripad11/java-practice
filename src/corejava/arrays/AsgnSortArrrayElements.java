package corejava.arrays;

import java.util.Arrays;

public class AsgnSortArrrayElements {
	/*
	 * Program to sort array elements using - bubble sort
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an integer array
		int x[] = {5,10,7,6,4,2,3,1,8,9};
		int temp = 0;
		System.out.println(x.length);
		System.out.println("Existing unsorted array is : "+Arrays.toString(x));
		
		System.out.print("Sorted array is : ");
		for(int i = 0;i < x.length;i++) {	//Number of passes
			for(int j = 0;j < x.length-1;j++) { //Number of iterations
				if(x[j]>x[j+1]) {
					temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(x));
	}

}
