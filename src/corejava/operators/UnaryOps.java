package corejava.operators;

public class UnaryOps {
	/*
	 * Unary Operators - [Increment and Decrement Operators]
	 */
	
	public static void main(String[] args) {
		int x = 100;
		System.out.println("Initial value of x - "+x);					//100
		System.out.println("1.Increment Operator");
		System.out.println("Value of x after post increment - "+(x++));	//100 - First value is printed and then incremented
		/*
		 * 102 - Previous value was 101(after printing 100) due to post increment 
		 * and later due pre increment value will be 102(that is - 101+1)
		 */
		System.out.println("Value of x after pre increment - "+(++x));	
		System.out.println("2.Decrement Operator");
		/*
		 * Previous value of x was 102 due to pre increment, hence when below statement gets 
		 * executed it will first print the value of x which is 102 and then decrement it in next statement
		 * So for next statement it will be 101(1 is minus because of post increment) and another 1 is minus 
		 * (because of pre-increment) so final value will be 100
		 */
		System.out.println("Value of x after post increment - "+(x--));	//102
		System.out.println("Value of x after pre increment - "+(--x));	//100
	}
}
