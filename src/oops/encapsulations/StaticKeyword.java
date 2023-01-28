package oops.encapsulations;

public class StaticKeyword {
	/*
	 * Whenever an object is created, it creates a separate copy of variables and methods present in a class.
	 * It creates duplication problem if multiple objects are created and also it is tedious job if wanted to update values
	 * Also extra memory will be utilized.
	 * To over come these issues, it can be determined that what all variables/methods are common and then make them static
	 * Whenever a method/variable is declared as static, only single copy will be created in the memory and that will be shared
	 * among multiple objects 
	 */
	
	static String university = "Savitribai Phule Pune University";
	int prn_no;
	String student_name;
	double marks;
	
	void getData(int prno,String name, double mark) {
		//System.out.println("Please enter the details of student : ");
		prn_no = prno;
		student_name = name;
		marks = mark;
		System.out.println(
				"Student PRN No  : "+prn_no+
				"\nStudent Name	   : "+student_name+
				"\nStudent Marks   : "+marks);
	}
	
	public static void main(String[] args) {
		System.out.println("Here are the details of 10 students : ");
		StaticKeyword sk,sk1,sk2;
		sk = new StaticKeyword();
		System.out.println("University Name   : "+university);
		sk.getData(100, "Shripad", 459);
		System.out.println("-----------------------------------------------------------");
		sk1 = new StaticKeyword();
		System.out.println("University Name   : "+university);
		sk.getData(101, "Shiwani", 465);
		System.out.println("-----------------------------------------------------------");
		sk2 = new StaticKeyword();
		System.out.println("University Name   : "+university);
		sk.getData(102, "Onkar", 459);
		System.out.println("-----------------------------------------------------------");
	}
}
