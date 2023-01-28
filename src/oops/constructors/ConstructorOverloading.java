package oops.constructors;

public class ConstructorOverloading {
	/*
	 * Constructor overloading - same Constructor name but sequence and no of parameteres are diff
	 * Keyword - 'this' is always used to differentiate class veriables from local variables if they are same
	 */
	int x,y;
	public ConstructorOverloading() {
		// TODO Auto-generated constructor stub
		System.out.println("Simple(a.k.a default) constructor!!!");
	}
	
	public ConstructorOverloading(int x,int y){
		// Initialize class veriables x and y 
		this.x = x;
		this.y = y;
	}
	
	int sum() {
		return x+y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading co = new ConstructorOverloading();
		co = new ConstructorOverloading(10,20);
		System.out.print("Sum is : "+co.sum());
	}

}
