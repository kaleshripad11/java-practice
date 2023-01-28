package corejava.arrays;
import java.util.Scanner;

public class AsgnSearchElementInArray {
	/*
	 * Search element in a given array
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num,i=0;
		int[] array = {10,20,30,50,15,90,81,48};
		System.out.println("Enter number to be searched in a given array :\n\n");
		num = s.nextInt();
		/*
		 * while(array[i]>0) { if(array[i]==num) {
		 * System.out.println("Your number "+num+" is found at "+i+" in given array");
		 * }else {
		 * System.out.println("Your number "+num+" is not present in given array!");
		 * break; } i++; }
		 */
		for(i=0;i<array.length;i++) {
			if(array[i]==num) {
				System.out.println("Your number "+num+" is found at index "+i+" in given array");
				break;
			}/*else {
				System.out.println("Your number "+num+" is not present in given array!");
				 break;
			}*/
			s.close();
		}
	}

}
