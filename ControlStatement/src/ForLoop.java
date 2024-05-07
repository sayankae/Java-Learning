import java.util.Random;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Single For Loop");
        System.out.println("Example of simple random number generator");
        for (int i = 0; i < 3; i++) {
            System.out.println(new Random().nextInt(0, 20));
        }

        System.out.println("Nested For Loop");
        System.out.println("Example of Multiplication Table");
        for (int i = 1; i < 3; i++) {
            System.out.println("Multiplication Table of " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }

        System.out.println("For Loop with pre-initialised variable");
        int i = 0;
        System.out.println("i is initialised outside the loop");
        for (; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println("For loop with no condition");
        for (i = 0; ; i++) {
            if (i >= 3) {
                System.out.println("Condition statement is written inside the for loop");
                break;
            }
            System.out.println(i);
        }

        System.out.println("For loop with no update");
        for (i = 0; i < 3; ) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("i is updated inside the for block");

        System.out.println("For Loop with no initialisation, no condition and no updates");
        i = 0;
        for (; ; ) {
            System.out.println(i);
            if (i >= 3) {
                System.out.println("Condition statement is inside the loop body");
                break;
            }
            i++;
        }
        System.out.println("i is updated inside the loop body");

        System.out.println("For loop with multiple variable and multiple updates");
        System.out.println("Example of square of a number");
        for (int j = 1, k = 1; k < 11; j++, k++) {
            System.out.println("Square of " + j + " = " + (j * k));
        }
    }
}
