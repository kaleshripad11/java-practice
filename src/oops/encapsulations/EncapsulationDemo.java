package oops.encapsulations;

public class EncapsulationDemo {
	/*
	 * Wrapping up data as a single unit is encapsulation
	 * Privacy is achieved through encapsulation using access modifiers - public, private, protected, default
	 * All variables are private and can be accessed through methods(getters, setters)
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetStudentDetails details = new GetStudentDetails();
		details.setRollNumber(10);
		details.setName("Shripad");
		details.setMarks(450.89);
		System.out.println("Below are the student details : ");
		System.out.println("Roll Number : "+details.getRollNumber()+", Name : "+details.getName()+", Marks : "+details.getMarks());
	}

}
