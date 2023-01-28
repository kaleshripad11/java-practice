package corejava.strings;
import java.util.Scanner;

public class AsgnPalindromeString {
    public static void main(String[] args) {
        String user_string, rev_string = "";
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi there, please enter any string : \n");
        user_string = scan.nextLine();
        // System.out.println(user_string.length()-1);
        for(i=user_string.length()-1;i>=0;--i){
            rev_string += user_string.charAt(i);
            // System.out.println(rev_string);
        }
        if(user_string.equals(rev_string))
            System.out.println("The string "+user_string+" is a palindrome string!");
        else
            System.out.println("The string "+user_string+" is not a palindrome string");
    }
}
