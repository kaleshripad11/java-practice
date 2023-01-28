package oops.constructors;

public class ConstructorDemo {
	/*
	 * Constructor - its a kind of method which has same name as of class name. 
	 * It is mostly used for initializing the objects, variables
	 * It can also have access specifiers but cant have return types
	 */
	static int i;
	public ConstructorDemo() {
		// TODO Auto-generated constructor stub
		System.out.print("This is a constructor method");
		i = 10; 		//Initialized variable i
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorDemo();
		System.out.println("Value of 'i' - "+i+" was initialized in constructor");
	}

}
