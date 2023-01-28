package oops.inheritance.multilevel;

public class IPhone extends Mobiles {
	String os_name = "IOS";
	void featuresOfIPhone() {
		System.out.println("Features of IPhone");
		System.out.println("1. IOS is closed source"
				+ "\n2. IOS is based on linux kernel"
				+ "\n3. Iphones are expensive"
				+ "\n4. It runs on "+os_name);
	}
}
