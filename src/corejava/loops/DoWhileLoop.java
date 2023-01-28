package corejava.loops;

public class DoWhileLoop {
	/*
	 * Print even numbers with do-while
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		do {
			if(i%2==0)
				System.out.print(i+" ");
				//This will move output after 50 to next line
				if(i==50)
					System.out.println();
			i++;
		}while(i<=100);
	}

}
