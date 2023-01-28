package oops.wrapperclasses;

public class AutoboxingVariables {
	/*
	 * Autoboxing => Converting premitive types to object types. We can use built in methods using those objects
	 * Inboxing => Converting object types to premitive types
	 */
	
	// Premitive types
	byte a = 1;
	char b = 'x';
	boolean c = false;
	short d = 10;
	int e = 100;
	long f = 10000000;
	float g = 100.9f;
	double h = 1000000.0;
	
	// Conversion to object types
	Byte byteobj = a;
	Character charobj = b;
	Boolean boolobj = c;
	Short shortobj = d;
	Integer intobj = e;
	Long longobj = f;
	Float floatobj = g;
	Double douleobj = h;
	
	void printAutoboxedTypes() {
		System.out.println("Byte : "+byteobj);
		System.out.println("Character : "+charobj);
		System.out.println("Boolean : "+boolobj);
		System.out.println("Short : "+shortobj);
		System.out.println("Integer : "+intobj);
		System.out.println("Long : "+longobj);
		System.out.println("Float : "+floatobj);
		System.out.println("Double : "+douleobj);
		System.out.println("----------------------------");
		printPremitiveTypes();
	}
	
	void printPremitiveTypes() {
		int x = byteobj; 		// Inboxing
		System.out.println("byte : "+a);
		System.out.println("char : "+b);
		System.out.println("boolean : "+c);
		System.out.println("short : "+d);
		System.out.println("int : "+e);
		System.out.println("long : "+f);
		System.out.println("float : "+g);
		System.out.println("double : "+h);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoboxingVariables av = new AutoboxingVariables();
		av.printAutoboxedTypes();
	}

}
