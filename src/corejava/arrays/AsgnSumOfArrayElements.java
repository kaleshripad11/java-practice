package corejava.arrays;
import java.util.Scanner;
public class AsgnSumOfArrayElements {
	/*
	 * Sum of array elements
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5]; int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements :");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("Sum of all array elements is : "+sum);
		sc.close();
	}
}
