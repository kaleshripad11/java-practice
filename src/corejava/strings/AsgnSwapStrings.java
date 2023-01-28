package corejava.strings;
import java.util.Scanner;

public class AsgnSwapStrings {
    /**
     * Swap two strings
     */
    public static void main(String[] args) {
        String a,b, temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first string");
        a = s.nextLine();
        System.out.println("Enter the second string");
        b = s.nextLine();
        System.out.println("Your strings "+a+" and "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped strings are - "+a+" and "+b);
    }
}
