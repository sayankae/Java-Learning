class D extends C {
    public void displayD() {
        System.out.println("This is method of class D");
    }
}

class E extends C {
    public void displayE() {
        System.out.println("This is method of class E");
    }
}

public class HierarchyInheritance {
    public static void main(String[] args) {
        System.out.println("Hierarchy Inheritance");
        D childD = new D();
        E childE = new E();
        System.out.println("Class D inherited all the methods except class E");
        childD.displayA();
        childD.displayB();
        childD.displayC();
        childD.displayD();
        System.out.println("Class E inherited all the methods except class D");
        childE.displayA();
        childE.displayB();
        childE.displayC();
        childE.displayE();
    }
}
