package corejava.conditionals;

public class LargestOfThree {
	/*
	 * Find largest among the three numbers
	 */
	
	public static void main(String[] args) {
		int a=10,b=200,c=70;
		if((a>b)&&(a>c)) {
			System.out.println("Larges is 'a'");
		}
		else if((b>a)&&(b>c)) {
			System.out.println("Larges is 'b'");
		}
		else if((c>a)&&(c>b)) {
			System.out.println("Larges is 'c'");
		}
	}
}
