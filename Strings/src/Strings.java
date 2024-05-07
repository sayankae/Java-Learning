public class Strings {

    private static void checkCallByRef(String s) {
        s = new String("New Hello");
    }

    public static void main(String[] args) {
        //String Initialisation
        String str = "Hello";

        String str1 = new String("Hello");

        System.out.println("Cannot replace element of the string like array");

        System.out.println("Checking if its call by value or call by reference");

        checkCallByRef(str);

        if (str1.equals(str)) {
            System.out.println("It is call by reference due to it immutable nature only copy of its reference is passed");
        } else {
            System.out.println("It is call by reference");
        }
    }
}