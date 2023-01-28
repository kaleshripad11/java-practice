package corejava.loops;
	
public class WhileLoops {
	/*
	 * Print only odd numbers using while loop
	 */
	public static void main(String[] args) {
		int n = 100;
		while(n>0) {
			if(n%2!=0)
				System.out.print(n+" ");
			n--;
		}
	}
}
