interface InterfaceA {
    void displayA();
}

interface InterfaceB {
    void displayB();
}

class ChildOf implements InterfaceA, InterfaceB {
    @Override
    public void displayA() {
        System.out.println("Method from Interface A");
    }

    @Override
    public void displayB() {
        System.out.println("Method from Interface B");
    }
}


public class MultipleInheritance {
    public static void main(String[] args) {
        ChildOf child = new ChildOf();
        System.out.println("Multiple Inheritance using Interface.");
        child.displayA();
        child.displayB();
    }
}
