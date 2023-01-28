package oops.inheritance;

class Root{
	int x,y;
	int performCalculation(int a,int b) {
		x = a;
		y = b;
		return (x+y);
	}
}

class Chield extends Root{
	int performCalculation(int a,int b) {
		System.out.println(super.performCalculation(100, 24));
		return (a-b);
	}
}

public class OverRiding{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chield over = new Chield();
		System.out.println(over.performCalculation(10, 5));
	}

}
