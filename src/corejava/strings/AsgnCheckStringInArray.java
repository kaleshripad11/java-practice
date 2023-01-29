package corejava.strings;
import java.util.Arrays;
import java.util.Scanner;
class AsgnCheckStringInArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str_arr[] = {"One","Two","Three","Four","Five"};
		System.out.println("Existing string array : "+Arrays.toString(str_arr));
		System.out.println("Please enter a string to search in string array");
		String user_string = sc.next();
		for(int i = 0;i<str_arr.length;i++) {
			if(str_arr[i].equalsIgnoreCase(user_string)) {
				System.out.println("Your string "+user_string+" is present at index "+i);
			}
			/*else {
				System.out.println("Your string "+user_string+" is not found in given array");
				System.out.println("Exiting program...!!!");
				break;
			}*/
		}
	
	}
}