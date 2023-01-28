package oops.methods;

public class OverloadingDemo {
	/*
	 * Method Overloading - Same method names but different signatures in a class
	 */
	String v;
	String vehicle(String vehicleName) {
		v = vehicleName;
		return v;
	}
	void vehicle() {
		System.out.println("This is the normal method without parameter"
				+ "\nIt will print information about - "+v);
	}
	
	int vehicle(int number_of_wheels) {
		return number_of_wheels;
	}
	
	static boolean vehicle(boolean can_fly) {
		return can_fly;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo odemo = new OverloadingDemo();
		odemo.vehicle("Plane");
		odemo.vehicle();
		System.out.println("Number of wheels "+odemo.vehicle(3));
		System.out.println("can fly? "+vehicle(true));
	}

}
