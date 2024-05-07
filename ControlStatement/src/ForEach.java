public class ForEach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Simple For Each Loop");
        for (int a : arr) {
            System.out.println(a);
        }

        System.out.println("For Each Loop for MultiDimensional Array");
        int[][] newarr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for (int[] a : newarr) {
            for (int b : a) {
                System.out.println(b);
            }
        }

        System.out.println("Can For Each Loop Update element");
        for (int a : arr) {
            System.out.println("Increment value by 1 of " + a + " = " + (a + 1));
            a++;
        }

        for (int a : arr) {
            System.out.println(a);
            System.out.println("Values did not changed.");

        }

        System.out.println("For Each with custom condition statement");
        for (int a : arr) {
            System.out.println(a);
            if (a == 5) {
                System.out.println("Loop will break at 5");
                break;
            }
        }

    }
}
