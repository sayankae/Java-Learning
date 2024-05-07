abstract class Example {
    abstract void display();

    void show() {
        System.out.println("This is concrete method");
    }
}

public class AbstractConcrete extends Example {
    void display() {
        System.out.println("This is an abstract method");
    }

    public static void main(String[] args) {
        AbstractConcrete obj = new AbstractConcrete();
        obj.show();
        obj.display();
    }
}
