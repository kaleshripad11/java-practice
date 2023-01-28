package oops.interfaces;

class Final{
	/*
	 * final keyword -
	 * 1. Final variables always should be initialized
	 * 2. Final class can not be extended/inherited to any other class
	 * 3. Final methods can not be overridden[final methods can be inherited]
	 */
	final int x = 10; // Final variables always should be initialized
	
	public final void testMethod() {
		System.out.println("This is a final method and can not be overridden");
	}
}

class FinalMethod extends Final{
	public final void testMethods() {
		testMethod();
		System.out.println("This is a dummy method printing final variable 'x' from parent class");
		System.out.println(x);
	}
}

public class FinalDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalMethod fm = new FinalMethod();
		fm.testMethods();
	}

}
