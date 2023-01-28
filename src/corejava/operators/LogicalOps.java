package corejava.operators;

public class LogicalOps {
	/*
	 * Logical Operators[&&, ||, !]
	 */
	public static void main(String[] args) {
		boolean a=true,b=false;
		System.out.println("True and False - "+(a&&b));					//False
		System.out.println("True or False - "+(a||b));					//True
		System.out.println("Negation of (True and False) - "+!(a&&b));	//True
		System.out.println("True and Negation of false - "+(a&&(!b)));	//True
		System.out.println("Negation of True or False - "+(!(a)||b)); 	//False
	}
}
