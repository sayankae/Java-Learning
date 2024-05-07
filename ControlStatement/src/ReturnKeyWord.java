public class ReturnKeyWord {

    private static int sumOfNumber(int n){
        if(n<=0){
            System.out.println("Method will exit from here because its exit point.");
            return 0;
        }
        return n+sumOfNumber(n-1);
    }

    public static void main(String []args){
        System.out.println("Return statement is the exit point of any method");
        System.out.println(sumOfNumber(4));
    }
}
