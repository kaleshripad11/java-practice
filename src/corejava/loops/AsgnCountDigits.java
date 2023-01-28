package corejava.loops;
import java.util.Scanner;

public class AsgnCountDigits {
	/*
	 * Program to get digits count in a number
	 */
	public static void main(String[] args) {
		int number,res = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:\n\n");
		number = sc.nextInt();
		while(number>0) {
			/*
			 * Logic -
			 * 1. First apply reverse number logic
			 * 2. And keep increasing count for each iteration until number values gets to zero
			 */
			res = res*10 + number%10;
			number = number/10;
			count += 1;
		}
		System.out.println("Number of digits in given number : "+count);
	}
}
