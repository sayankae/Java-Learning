public class Main {
    public int b = 50;
    static int c;
    public static void main(String[] args) {
        // Variables
        int a = 0;
        System.out.println(a); //Here 'a' is a variable and also a local variable
        c = 3;
        System.out.println(c); //Here 'c' is a variable and known as static variable
        Main obj = new Main();
        System.out.println(obj.b); //Here 'b' is a variable and known as instance variable.
    }
}