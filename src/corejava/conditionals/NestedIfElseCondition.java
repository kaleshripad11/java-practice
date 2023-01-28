package corejava.conditionals;

public class NestedIfElseCondition {
	/*
	 * Nested if else(if-else within if - else
	 */
	public static void main(String[] args) {
		if(true) {
			if(false) 
				System.out.println("You are in nested if part");
			else 
				System.out.println("You are in nested else part");
		}else 
			System.out.println("Exit..!!");
	}
}
