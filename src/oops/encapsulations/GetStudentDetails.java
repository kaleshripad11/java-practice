package oops.encapsulations;

public class GetStudentDetails {
	private int roll;
	private String name;
	private double marks;
	
	//Below setter methods will not return any value, they will just set the variables
	//setter method to set roll number
	void setRollNumber(int rno) {	
		roll = rno;
	}
	
	void setName(String name) {	
		this.name = name;
	}
	
	void setMarks(double marks) {	
		this.marks = marks;
	}
	
	// Below getter methods will only return the values stored in the variables
	int getRollNumber() {
		return roll;
	}
	
	String getName() {
		return name;
	}
	
	double getMarks() {
		return marks;
	}
}
