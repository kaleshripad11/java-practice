package corejava.conditionals;
import java.util.Scanner;

public class AsgnSmallOfTwo {
	/*
	 * Smallest of two using ternary operator
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.println("Input values for a,b - ");
		System.out.println("a = ");
		a = s.nextInt();
		System.out.println("b = ");
		b = s.nextInt();
		System.out.println("Smallest is "+(((a<b)?a:b)));
	}

}
