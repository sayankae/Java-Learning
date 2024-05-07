import java.util.Random;

public class IfElse {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt();
        int b = rand.nextInt();
        System.out.println("Single If-Else Statement");
        if (a > b) {
            System.out.println("A is greater than B " + a + " > " + b);
        } else {
            System.out.println("B is greater than or equal to A " + b + " >= " + a);
        }

        System.out.println("Nested If Else Statement");
        a = rand.nextInt(20);
        b = rand.nextInt(20);

        if (a > b) {
            if (a < 15) {
                System.out.println(a + " > " + b + " and " + "A is less than 15");
            } else {
                System.out.println(a + " > " + b + " and " + "A is greater than or equal to 15");
            }
        } else {
            if (b < 15) {
                System.out.println(b + " >= " + a + " and " + "B is less than 15");
            } else {
                System.out.println(b + " >= " + a + " and " + "B is greater than or equal to 15");
            }
        }

        System.out.println("Else if Statement");
        a = rand.nextInt(5);
        b = rand.nextInt(5);

        if (a > b) {
            System.out.println("A is greater than B " + a + " > " + b);
        } else if (b > a) {
            System.out.println("B is greater than A " + b + " > " + a);
        } else {
            System.out.println("A is equal to B " + a + " == " + b);
        }
    }
}