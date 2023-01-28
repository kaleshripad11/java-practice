package corejava.conditionals;
import java.util.Scanner;

public class SwitchCondition {
	/*
	 * Switch case
	 */
	public static void main(String[] args) {
		int a,b,choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter values for a and b");
		System.out.println("Value of a - ");
		a = sc.nextInt();
		
		System.out.println("Value of b - ");
		b = sc.nextInt();
		
		System.out.println("Please enter your choice among below options");
		System.out.println("1.Addition\t\t2.Substraction\n3.Multiplication\t4.Division\n5.Remainder");
		choice = sc.nextInt();
		
		switch(choice) {
			case 1:System.out.println(a+b);
			break;
			case 2:System.out.println(a-b);
			break;
			case 3:System.out.println(a*b);
			break;
			case 4:System.out.println(a/b);
			break;
			case 5:System.out.println(a%b);
			break;
			default:System.out.println("You did not made any choice");
		}
	}
}
