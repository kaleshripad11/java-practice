package corejava.loops;

import java.util.Scanner;

public class AsgnPalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,rev=0, palindrome;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		number = s.nextInt();
		palindrome = number;
		while(number>0) {
			/*
			 * Logic -
			 * 1. First using formula separate each digit and save it to a variable => reverse = rev*10 + number%10
			 * 2. Then remove ending digit from given number using formula => number = number/10. 
			 * 3. Repeat above steps until value of number reaches to zero
			 */
			rev = rev*10 + number%10;
			number = number/10;
		}
		//System.out.println(palindrome+"  "+rev);
		System.out.println((palindrome==rev)?"Given number is palindrome!":"Given number is not a palindrome!");

	}
}
