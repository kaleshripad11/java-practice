package corejava.strings;
import java.util.Scanner;

public class AsgnRevString {
    /**
     * Program to reverse given string
     * 1. Take a string as input from user and store it to a string variable
     * 2. Apply for loop and separate each character using charAt(index) and store it to some other string var in the loop
     * 3. Print the other string variable
     */
    public static void main(String[] args) {
        String user_string, rev_string = "";
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi there, please enter any string : \n");
        user_string = scan.nextLine();
        System.out.println(user_string.length()-1);
        for(i=user_string.length()-1;i>=0;--i){
            /**
             * This loop will start scanning character from the ending of the string.
             * later it will check if value of i is greater or equal to zero, if it is then it will enter into loop
             * and whatever character is present at end of the given string that will be copied to a new string using charAt(index)
             */
            rev_string += user_string.charAt(i);
            //System.out.println(rev_string);
        }
        System.out.println("Original string is : "+user_string+", its reversed string is : "+rev_string);
    }
}
