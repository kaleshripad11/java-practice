package corejava.loops;
import java.util.Scanner;
public class AsgnReverseNumber {
	/*
	 * Program to reverse a given number
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,number,last,rev=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any 4 digit number");
		number = s.nextInt();
		for(i=0;i<4;i++) {
			last = number%10;		//This will return the last digit in given number
			rev = (rev*10)+last;	//This will replace the first digit in given number
			number = number/10;
			//System.out.println(number+" "+last+" "+rev);
		}
		System.out.println(rev);
	}

}
