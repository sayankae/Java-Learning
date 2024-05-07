import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Simple While Loop");
        System.out.println("Example Random double generator between 0 and 1");
        while (i < 4) {
            System.out.println(new Random().nextDouble());
            i++;
        }

        System.out.println("Nested While Loop");
        System.out.println("Example of Multiplication Table");
        i = 1;
        while (i < 3) {
            int j = 1;
            System.out.println("Multiplication Table of " + i);
            while (j <= 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            i++;
        }


        System.out.println("While loop with true condition");
        i = 0;
        while (true) {
            if (i >= 10) {
                System.out.println("I has reached 10. Using break to falsify the condition.");
                break;
            }
            i++;
        }

        System.out.println("While with update and condition statement inside ()");
        i = 0;
        while (++i < 4) {
            System.out.println(i);
        }

        System.out.println("While with input stream");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            System.out.println(scan.next());
        }
        scan.close();
    }
}
