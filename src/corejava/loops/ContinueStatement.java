package corejava.loops;

public class ContinueStatement {
	/*
	 * Continue statement will skip the iteration where condition is matched. This will not terminate loop
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<10;i++) {
			//System.out.println(i+" ");	//This will not skip 5 as condition being checked later
			if(i==5) {
				continue;
			}
			System.out.println(i+" ");
		}
	}

}
