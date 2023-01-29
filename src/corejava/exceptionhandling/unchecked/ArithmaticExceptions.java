package corejava.exceptionhandling.unchecked;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmaticExceptions {
	/*
	 * This program will demo devide/zero exception
	 */
	Scanner sc = new Scanner(System.in);
	int x,y;
	
	void performDivision() {
		try {
			System.out.println("Enter value of x :");
			x = sc.nextInt();
			System.out.println("Enter value of y :");
			y = sc.nextInt();
			System.out.println("Division of x and y : "+(x/y));
		}
		catch(ArithmeticException devidebyzero){
			System.out.println("Exception occured : "+devidebyzero.toString());
		}
		catch(InputMismatchException inputmismatchex) {
			System.out.println("Exception occured : "+inputmismatchex.toString());
		}
		finally {
			System.out.println("Done!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmaticExceptions zero = new ArithmaticExceptions();
		zero.performDivision();
	}

}
