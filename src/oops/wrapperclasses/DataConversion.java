package oops.wrapperclasses;

public class DataConversion {
	/*
	 * In java we can convert one type to other using Premitive classes methods
	 */
	
	String x = "10", y = "100";
	
	void performSum() {
		System.out.println("sum is - "+(Integer.parseInt(x)+Integer.parseInt(y)));
	}
	
	void convertToString() {
		System.out.println("Type of sum is - "+((Object)String.valueOf(Integer.parseInt(x)+Integer.parseInt(y))).getClass().getName());
		System.out.println("Sum - "+String.valueOf(Integer.parseInt(x)+Integer.parseInt(y)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataConversion dc = new DataConversion();
		dc.performSum();
		dc.convertToString();
	}

}
