package corejava.strings;
import java.util.Arrays;
import java.util.Scanner;
public class StringFunctions {
    /**
     * Program for built-in string functions in java
     * 1. length()
     * 2. concat()
     * 3. charAt()
     * 4. trim();
     * 5.
     */
    public static void main(String[] args) {
        String s1,s2;
        char ch;
        int index;
        String split_string[];
        String trim_str = "        Hi             ";
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter first string :");
        s1 = s.nextLine();
        System.out.println("Please enter second string :");
        s2 = s.nextLine();
        System.out.println("Please enter Index to search a specific character in string 's1' :");
        index = s.nextInt();
        ch = (char)s1.charAt(index);    // Type casting required
        System.out.println("String length for strings 's1' - "+s1.length()+" and 's2' - "+s2.length());
        System.out.println("Concatination of string "+s1+" and "+s2+" is - "+(s1+" ").concat(s2));
        System.out.println("Original string 'trim_str' - "+trim_str+" and its whitespaces trimmed string - "+trim_str.trim());
        System.out.println("Character '"+ch+"' is present at "+index+" in given string s1 "+s1);
        split_string = "Hi there, I am Java Programming".split(",");
        System.out.println("Split string 'Hi there, I am Java Programming' using 'split()' function - "+split_string);
        System.out.println("Check character '"+ch+" is present in given string or not using 'contains()'"+s1.concat("e"));
        System.out.println("Replacing "+trim_str+" with character '@' "+trim_str.replace(" ","@"));
        System.out.println("Convert a string to upper case - "+s1.toUpperCase());
        System.out.println("Convert a string to lower case - "+s1.toUpperCase().toLowerCase());
        System.out.println("Let's extract some part of this string".substring(6,13));
    }
}
