class A {
    public void displayA() {
        System.out.println("This is method of class A.");
    }
}

class B extends A {
    public void displayB() {
        System.out.println("This is method of class B.");
    }
}

class C extends B {
    public void displayC() {
        System.out.println("This is method of class C.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C child = new C();
        System.out.println("Multilevel Inheritance");
        child.displayA();
        child.displayB();
        child.displayC();
    }
}
