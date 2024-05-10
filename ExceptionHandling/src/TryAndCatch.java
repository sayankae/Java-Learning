public class TryAndCatch {
    public static void main(String[] args) {
        System.out.println("Simple Try and Catch Block.");
        int[] arr = new int[3];
        try {
            arr[4] = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("\nTry with multiple Catch Block");
        try {
            arr[0] = 1;
            arr[1] = 2;
            arr[4] = 0;
        } catch (ArithmeticException e) {
            System.out.println("Catch Block 1");
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catch Block 2");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Catch Block 3");
            System.out.println(e);
        }

        System.out.println("\nNested Try and Catch Block");
        int a = 5;
        int b = 0;
        try {
            try {
                int c = a / b;
            } catch (ArithmeticException e) {
                System.out.println("Catch inside Try Block.");
                System.out.println(e);
            }
            arr[-1] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch outside Try Block");
            System.out.println(e);
            try {
                int c = a % b;
            } catch (Exception f) {
                System.out.println("Catch inside Catch Block");
                System.out.println(f);
            }
        }
    }
}
