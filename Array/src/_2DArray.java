public class _2DArray {
    public static void main(String[] args) {
        //2D Array Initialisation
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        //Array Traversing
        System.out.println("Traversing Statically Allocated Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int n = 4;
        int m = 4;

        arr = new int[n][m];

        //Array element Initialization
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i * j + 2;
            }
        }

        System.out.println("Traversing Dynamically Allocated Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        //Jagged Array
        arr = new int[4][];
        System.out.println("Dynamically Allocated Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Putting " + (i + 1) + " space at " + (i) + " index.");
            arr[i] = new int[i + 1];
        }

        //Array element Initialization
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i * j + 2;
            }
        }

        System.out.println("Traversing Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
