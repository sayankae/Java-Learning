public class ContinueKeyWord {
    public static void main(String[] args) {
        System.out.println("Continue will go to next iteration");
        System.out.println("Continue with For Loop");
        for (int i = 0; i < 6; i++) {
            if (i * i < 20) {
                continue;
            }
            System.out.println((i * i) + " is more than 20.");
        }

        System.out.println("Continue with While Loop");
        int i = 0;
        while (true) {
            if (i < 3) {
                System.out.println("This statement is before continue");
                i++;
                continue;
            }
            System.out.println("This statement is outside continue");
            System.out.println("I is 3 so it will not continue");
            break;
        }

        System.out.println("Continue with Do While Loop");
        i = 0;
        do {
            if (i < 3) {
                System.out.println("This statement is before continue");
                i++;
                continue;
            }
            System.out.println("This statement is outside continue");
            System.out.println("I is 3 so it will not continue");
            break;
        } while (true);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Continue with For Each Loop");
        for (int a : arr) {
            if (a % 2 == 0) {
                continue;
            }
            System.out.println("Printing only Odd Number " + a);
        }
    }
}
