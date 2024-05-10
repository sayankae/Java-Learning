public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("Normal Finally Block");
        try {
            System.out.println("Try BLock running.");
            int a = 5;
            int b = 0;
            int c = a / b;
        } catch (Exception e) {
            System.out.println("If Error occurs this Catch Block Initiates.");
        } finally {
            System.out.println("Finally Block runs even if there is error occurs or not");
        }

        System.out.println("\nTry and Finally");
        try {
            System.out.println("Try BLock running.");
            int a = 5;
            int b = 0;
            int c = a / b;
        } catch (Exception e) {
            System.out.println("This Catch Block is added just to make program continue after finally otherwise it will stop after finally.");
        } finally {
            System.out.println("Finally Block runs even if there is no catch block but program will not continue due to missing catch block");
        }

        System.out.println("\nNested Finally Block");
        try {
            int a = 5;
            try {
                int b = 0;
                int c = a / b;
            } catch (Exception e) {
                System.out.println("Catch inside Try Block");
            } finally {
                System.out.println("Finally inside Try Block");
            }
        } finally {
            try {
                System.out.println("Try inside Finally Block");
                int a = 6;
                int b = 3;
                int c = a / b;
            } finally {
                System.out.println("Finally inside Finally BLock");
            }
        }

        int[] arr = new int[3];
        System.out.println("\nFinal with Multiple Catch Block");
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
        } finally {
            System.out.println("This Finally Block runs after multiple Catch Block");
        }
    }
}
