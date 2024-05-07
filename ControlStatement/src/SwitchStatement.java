import java.util.Random;

public class SwitchStatement {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(4);

        System.out.println("Switch Statement");
        switch (n) {
            case 1: {
                System.out.println("N is 1");
                break;
            }
            case 2: {
                System.out.println("N is 2");
                break;
            }
            case 3: {
                System.out.println("N is 3");
                break;
            }
            default: {
                System.out.println("N is 4");
                break;
            }
        }

        n = rand.nextInt(1, 6);

        System.out.println("Nested Switch Case");
        switch (n) {
            case 1:
            case 2:
            case 3: {
                switch (n) {
                    case 1: {
                        System.out.println("N is 1");
                        break;
                    }
                    case 2: {
                        System.out.println("N is 2");
                        break;
                    }
                    case 3: {
                        System.out.println("N is 3");
                        break;
                    }
                }
            }
            case 5: {
                switch (n) {
                    case 5: {
                        System.out.println("N is 5");
                        break;
                    }
                    default: {
                        break;
                    }
                }
                break;
            }
            default: {
                System.out.println("N is " + n);
                break;
            }
        }
    }
}
