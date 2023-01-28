package oops.inheritance.hierarchical;
import java.util.Scanner;
public class Mobiles {
	String basic_purpose = "To make and receive phone calls!";
	long number;
	Scanner scan = new Scanner(System.in);
	void dialer() {
		System.out.println("Input number for dialing a call!");
		number = scan.nextLong();
	}
}
