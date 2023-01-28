package corejava.strings;

public class StringCompWithBuiltIns {
    /**
     * Compare strings without builtin function equals()
     * @param args
     */
    public static void main(String[] args) {
        String string = "Welcome to Java";
        String str = new String("Welcome to Java Programming");
        String str1 = new String("Welcome to Java");
        String string1 = "Welcome to Java";
        if(string1==string)
            System.out.println("Both are equal");
        else
            System.out.println("Both are un-equal");

        if(string==str1)
            System.out.println("Both are equal");
        else
            System.out.println("Both are un-equal");
    }
}
