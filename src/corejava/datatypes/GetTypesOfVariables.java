package corejava.datatypes;

public class GetTypesOfVariables {
	/*
	 * In Java data types are devided into two categories
	 * 1 - Premitive Types[byte, short, int, long, float, double, char, boolean]
	 * 2 - Non Premitive[String, Arraylist, Hashset, ...etc]
	 * */
		
	public static void main(String[] args) {
		byte b1 = 127; 
		char c = 'I';
		short s = 32767;
		int i = 2000000000;
		long l = 2000000000;
		float f = 30.5f;
		double d = 4000.0;
		boolean b2 = false;
		/*
		 * Typecast all variables using Object class and use getName() from Java.lang package to get the 
		 * class type of variable
		 */
		System.out.println("Your veriables are - ");
		System.out.println("Type of b1 is "+((Object)b1).getClass().getName()+" and its value is "+b1);
		System.out.println("Type of c is "+((Object)c).getClass().getName()+" and its value is "+c);
		System.out.println("Type of s is "+((Object)s).getClass().getName()+" and its value is "+s);
		System.out.println("Type of i is "+((Object)i).getClass().getName()+" and its value is "+i);
		System.out.println("Type of l is "+((Object)l).getClass().getName()+" and its value is "+l);
		System.out.println("Type of f is "+((Object)f).getClass().getName()+" and its value is "+f);
		System.out.println("Type of d is "+((Object)d).getClass().getName()+" and its value is "+d);
		System.out.println("Type of b2 is "+((Object)b2).getClass().getName()+" and its value is "+b2);
	}
}
