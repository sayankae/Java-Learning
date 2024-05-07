import java.util.Arrays;

public class StringMethods {

    private static void createString() {
        String s = new String();
        System.out.println("Created Empty String. " + s);
        s = new String("Hello");
        System.out.println("Created String by passing Original String. " + s);
        char[] arr = {'C', 'H', 'A', 'R', 'A', 'C', 'T', 'E', 'R', ' ', 'A', 'R', 'R', 'A', 'Y'};
        s = new String(arr);
        System.out.println("Created String by passing Character Array. " + s);
        byte[] newarr = {65, 83, 67, 73, 73, 32, 65, 82, 82, 65, 89};
        s = new String(newarr);
        System.out.println("Created String by passing Byte Array. " + s);
    }

    private static void stringMethods() {
        String s = "This is a string";
        System.out.println("This method finds length of the String " + s.length());
        System.out.println("This method finds the Character at particular here 6th index " + s.charAt(6));
        System.out.println("This method compares the String hashcode to compare if they are equal " + s.equals("This is a String"));
        System.out.println("This method compares the String value which one is lexicographical order " + s.compareTo("xyz"));
        System.out.println("This method concatenate two strings " + s.concat(". This is added"));
        System.out.println("This method takes out substring " + s.substring(0, 6));
        System.out.println("This method changes the case of string to upper case " + s.toUpperCase());
        System.out.println("This method changes the case of string to lower case " + s.toLowerCase());
        String[] arr = s.split(" ");
        System.out.println("This method splits the string with a particular regex " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.println("String  Constructor");
        createString();
        System.out.println("String Methods");
        stringMethods();

    }
}
