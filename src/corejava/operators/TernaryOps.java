package corejava.operators;

public class TernaryOps {
	/*
	 * Ternary operators[?,:]
	 * Syntax - var = exp ? result 1 : result 2
	 */
	public static void main(String[] args) {
		int x=10,y=100,voter_age=20;
		System.out.println("Which one is greater X or Y "+((x>y)?x:y));
		System.out.println("Is voter eligible for voting? "+(voter_age>18?"Eligble to vote":"Not eligible"));
	}
}
