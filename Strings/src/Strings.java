public class Strings {

    private static void checkCallByRef(String s) {
        s = new String("New Hello");
    }

    private static void checkCallByRef(StringBuilder s) {
        s.append("New Hello");
    }

    public static void main(String[] args) {
        //String Initialisation
        String str = "Hello";

        String str1 = new String("Hello");

        System.out.println("String is " + str);

        System.out.println("Cannot replace element of the string like array");

        System.out.println("Checking if its call by value or call by reference");

        checkCallByRef(str);

        if (str1.equals(str)) {
            System.out.println("It is call by reference due to it immutable nature only copy of its reference is passed");
        } else {
            System.out.println("It is call by reference");
        }

        StringBuilder str2 = new StringBuilder("Hello");

        System.out.println("String builder is " + str2);

        checkCallByRef(str2);

        if (str2.equals(new StringBuilder("Hello"))) {
            System.out.println("It is call by reference due to it immutable nature only copy of its reference is passed");
        } else {
            System.out.println("It is call by reference because it mutable.");
        }

    }
}