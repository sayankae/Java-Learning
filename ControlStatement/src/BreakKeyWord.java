public class BreakKeyWord {
    public static void main(String[] args) {
        System.out.println("Break will stop iteration and exit out of current loop");
        System.out.println("Break with For Loop");
        for (int i = 0; i < 6; i++) {
            if (i * i > 20) {
                System.out.println("Breaking because it is more than 20");
                break;
            }
            System.out.println((i * i) + " is less than 20.");
        }

        System.out.println("Break with While Loop");
        int i = 0;
        while (true) {
            if (i >= 3) {
                System.out.println("I is greater than 3 so below statement will not print and it will break");
                i++;
                break;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("Break with Do While Loop");
        i = 0;
        do {
            if (i >= 3) {
                System.out.println("I is 3 so it will break");
                break;
            }
            System.out.println(i);
            i++;
        } while (true);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Break with For Each Loop");
        for (int a : arr) {
            if (a >= 5) {
                System.out.println("It will break because element is greater than equal to 5");
                break;
            }
            System.out.println("Printing " + a);
        }
    }
}
