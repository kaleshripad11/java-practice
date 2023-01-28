package oops.interfaces;

public class InterfaceMain implements DemoInterface {
	@Override
	public int printSum(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}
	
	@Override
	public void testMethod(String message) {
		// TODO Auto-generated method stub
		String m = message;
		System.out.println("Your message - "+m);
		printMessage();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMain Int = new InterfaceMain();
		System.out.println(Int.printSum(100, 25));
		Int.testMethod("Hey there!");
		DemoInterface.showMessage();
		/*
		DemoInterface di = new InterfaceMain();
		di.printMessage();
		*/
	}

}
