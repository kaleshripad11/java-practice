package oops.inheritance.hierarchical;

public class Android extends Mobiles {
	String os_name = "Android OS";
	void featursOfAndroid() {
		System.out.println("Features of android");
		System.out.println("1. Android is opensource"
				+ "\n2. Android is based on linux kernel"
				+ "\n3. Android devices are way cheaper as compared to IOS devices"
				+ "\n4. It runs on "+os_name);
	}
}
