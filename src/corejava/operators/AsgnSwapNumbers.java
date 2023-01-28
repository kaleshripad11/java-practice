package corejava.operators;

public class AsgnSwapNumbers {
	/*
	 * Assignment - Program to swap two numbers
	 */
	
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Your variables a - "+a+" and b - "+b);
		/*
		 * Logic to swap
		 */
		a=a+b;	//a(10)+b(20)=a(30)
		b=a-b;	//a(30)-b(20)=b(10)
		a=a-b;	//a(30)-b(10)=a(20)
		System.out.println("Swapped values of a & b are :");
		System.out.println("Value of a - "+a+" and value of b - "+b);
	}
}
