package oops.interfaces;

public interface DemoInterface {
	/*
	 * Interface is like a blueprint of class
	 * Interface can have only abstract methods(method declarations only) till java 7.
	 * From java 8 onwards, default and static methods also allowed(we can define static and default methods)
	 * All methods(abstract, static) in interface are public by default except 'default' methods
	 * All abstract(un-implemented) methods must be implemented in a class
	 * Only static, final variables can be created in interface
	 * While implementing abstract methods we can't reduce their visibility(can't change the access modifier while implementing method)
	 * Object of interface can not created, but an interface variable can hold object of class
	 */
	int x = 200;
	void testMethod(String message);
	int printSum(int a,int b);
	default void printMessage() {
		// This method is by default public
		System.out.println("This is an default method from 'DemoInterface'");
	}
	
	static void showMessage() {
		// This method is by default public
		System.out.println("This is an static method from 'DemoInterface' and printing value of static variable 'x' - "+x);
	}
}
