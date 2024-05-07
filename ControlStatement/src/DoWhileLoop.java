public class DoWhileLoop {
    public static void main(String[] args) {
        System.out.println("Simple Do While Loop");
        System.out.println("Example of Security Guard Drill");
        int i = 0;
        do {
            System.out.println("Checking the customer " + i);
            i++;
        } while (i < 3);

        System.out.println("Nested Do While Loop");
        System.out.println("Example of Multiplication Table");
        i = 1;
        do {
            System.out.println("Multiplication table of " + i);
            int j = 1;
            do {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            } while (j <= 10);
            i++;
        } while (i < 3);


        System.out.println("Do While Loop with true condition");
        i = 0;
        do {
            System.out.println(i);
            i++;
            if (i >= 3) {
                break;
            }
        } while (true);

    }
}
