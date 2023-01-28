package corejava.conditionals;
import java.util.Scanner;

public class AsgnSmallestofThree {
	/*
	 * Program to find out smallest of three numbers
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b,c;
		System.out.println("Input values for a,b and c - ");
		System.out.println("a = ");
		a = s.nextInt();
		System.out.println("b = ");
		b = s.nextInt();
		System.out.println("c = ");
		c = s.nextInt();
		
		if((a<b)&&(a<c)) {
			System.out.println("Smallest is "+a);
		}else if((b<a)&&(b<c)) {
			System.out.println("Smallest is "+b);
		}else if((c<b)&&(c<a)) {
			System.out.println("Smallest is "+c);
		}
	}

}
