package corejava.exceptionhandling.checked;

public class SimpleCheckedException {
	/*
	 * We can use 'throws' keyword. it is used at method level. 
	 * Checked excpetions can be handled with either try-catch or 'throws'
	 * 1. FileNotFoundException
	 * 2. IOException
	 * 3. InterruptedException
	 */
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i = 0;i<50;i++) {
			Thread.sleep(1000);
			System.out.print(i+" ");
		}
	}

}
