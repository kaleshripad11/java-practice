package corejava.exceptionhandling.unchecked;

public class UncheckedExceptions {
	/* Exception - is an event which causes the termination of program
	 * Checked exceptions are identified by java compiler but unchecked can not be identified. 
	 * Below are some unchecked exceptions
	 * 1. ArrayIndexOutOfBoundsException
	 * 2. ArithmeticException
	 * 3. NumberFormatException
	 * Below are some checked exceptions
	 * 1. FileNotFoundException
	 * 2. IOException
	 * 3. InterruptedException
	 */
	
	int performDivision(int a,int b) {
		return (a/b);
	}

	String convertToNumber(String digit) {
		return String.valueOf(Integer.parseInt(digit));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program exceution started here !!!");
		UncheckedExceptions ue = new UncheckedExceptions();
		try {
			System.out.println(ue.performDivision(100, 0));
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
			System.out.println("Please enter number other than 0 in denominator ");
		}
		finally {
			System.out.println("Finally executed!!");
		}
		
		try {
			System.out.println(ue.convertToNumber("Ten"));
		}
		catch(Exception e) {
			//System.out.println(e.toString());
			System.out.println("Exception occured : "+e.toString());
		}
		System.out.println("Program execution completed !!!");
	}

}
