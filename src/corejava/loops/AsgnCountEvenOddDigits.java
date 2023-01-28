package corejava.loops;
import java.util.Scanner;

public class AsgnCountEvenOddDigits {
	/*
	 * Count the even and odd digits in given number
	 * Logic(Using while) -
	 * 1. Separate each single digit in given number and store it in a variable
	 * 2. Then using if-else determine the if the separated digit is even or odd 
	 * 3. Then devide the number by 10 to trim ending digits in it so that the end of loop, the number will be zero and loop will get break 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, even_count = 0, odd_count=0, digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:\n\n");
		number = sc.nextInt();
		while(number>0) {
			digit = number % 10;
			if(digit%2==0) {
				even_count += 1;
			}else{
				odd_count +=1;
			}
			number = number/10;
		}
		System.out.println("Number of even digits in given number : "+even_count);
		System.out.println("Number of odd digits in given number "+odd_count);
	}

}
