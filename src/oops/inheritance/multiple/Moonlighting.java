package oops.inheritance.multiple;

public class Moonlighting implements CompanyA, CompanyB {
	@Override
	public void printEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Printing details of employee - ");
		System.out.println("Name : "+CompanyA.emp_name+", Department : "+CompanyA.dept+", Salary : "+CompanyA.salary);
	}
	
	public void showEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Showing details of employee - ");
		System.out.println("Name : "+CompanyB.emp_name+", Department : "+CompanyB.dept+", Salary : "+CompanyB.salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Moonlighting m = new Moonlighting();
		m.printEmployeeDetails();
		m.showEmployeeDetails();
	}

}
