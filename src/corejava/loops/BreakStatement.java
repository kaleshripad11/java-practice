package corejava.loops;

public class BreakStatement {
	/*
	 * Break statement will terminate the loop execution and move control out of the loop
	 */
	public static void main(String[] args) {
		int i;
		for(i=0;i<10;i++) {
			//System.out.println(i+" "); //This will print up to 3
			if(i==3) {
				//System.out.println(i+" "); => This will print only 3
				break;
			}
			System.out.println(i+" ");	//This will print up to 2
		}
	}
}
