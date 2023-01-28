package corejava.strings;

public class StringBasic {
    /**
     * Strings in Java
     */
    public static void main(String[] args) {
        String string = "Welcome to Java";  //  String as Non - Primitive data type
        String str = new String("Welcome to Java Programming"); // String as a class object

        System.out.println("Value of 'string' variable is '"+string+"' and its type is "+((Object)string).getClass().getName());
        System.out.println("Value of 'str' variable is '"+str+"' and its type is "+((Object)str).getClass().getName());
    }
}
