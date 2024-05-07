public class _1DArray {

    private static void checkCallByRef(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Setting Element " + i + " as " + (arr[i] = i + 2));
        }
    }

    public static void main(String[] args) {
        //Array Initialisation
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Traversing Statically Allocated Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int n = 3;
        //Dynamic Allocation
        arr = new int[n];

        //Array element Initialization
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println();
        System.out.println("Traversing Dynamically Allocated Array");
        //Traversing the Array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int[] temp = arr.clone();

        System.out.println();
        checkCallByRef(arr);

        System.out.println("Checking the Array is call by value or call by reference");
        //Traversing the Array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Old value at index " + i + " was " + temp[i]);
            System.out.println("New value at index " + i + " is " + arr[i]);
        }

    }
}