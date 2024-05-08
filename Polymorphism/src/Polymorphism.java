public class Polymorphism {

    public int Area() {
        return 0;
    }

    private static int Area(int i, int j) {
        return i * j;
    }

    private static double Area(double r) {
        return Math.PI * r * r;
    }

    private static int Area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        System.out.println("Method Overloading");
        System.out.println("Calling Method Area for different number parameters");
        System.out.println("Area of Rectangle l  5 , h  4 = " + Area(5, 4));
        System.out.println("Area of Circle r  3.7 = " + Area(3.7));
        System.out.println("Area of Square s  4 = " + Area(5));
        System.out.println("Method Overriding");
        System.out.println("Creating a child class which extends Polymorphism Class with its own Area method");
        Rectangle rect = new Rectangle(5, 4);
        System.out.println("Area of Rectangle l  5 , h  4 = " + rect.Area());
    }
}

class Rectangle extends Polymorphism {
    private int l;
    private int h;


    Rectangle(int l, int h) {
        this.l = l;
        this.h = h;
    }

    @Override
    public int Area() {
        return this.l * this.h;
    }
}