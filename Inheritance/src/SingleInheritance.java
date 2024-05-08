class Parent {
    public void displayParent() {
        System.out.println("This is parent.");
    }
}

class Child extends Parent {
    public void displayChild() {
        System.out.println("This is child");
        super.displayParent();
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("Single Inheritance");
        Child child = new Child();
        child.displayChild();
    }
}