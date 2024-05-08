final class FinalClass {
    public void display() {
        System.out.println("This is a final class and cannot be inherited nor override.");
    }
}

class StaticClass {
    static int a = 0;

    static class NestedClass {
        public static void display() {
            System.out.println("This is a static class and can be accessed with class name and '.' ");
        }
    }

}

abstract class AbstractClass {
    abstract void display();
}

class AbstractExtender extends AbstractClass {
    void display() {
        System.out.println("Abstract properties defined by Child Class.");
    }
}

class POJO {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Singleton {
    private static Singleton root;
    private String name;

    public static Singleton Singleton(String s) {
        if (root == null) {
            root = new Singleton();
            root.name = s;
        } else {
            System.out.println("Value will not change because object is referenced to same object");
        }
        return root;
    }

    public void display() {
        System.out.println(name);
    }
}

public class ClassTypes {
    public static void main(String[] args) {
        new FinalClass().display();
        StaticClass.NestedClass.display();
        new AbstractExtender().display();
        POJO obj = new POJO();
        System.out.println("Putting values in Pojo class");
        obj.setName("Marvel");
        System.out.println("Getting Values from POJO class using getter -> " + obj.getName());
        Singleton obj2 = Singleton.Singleton("Superman");
        System.out.println("Making a Superman object with Singleton Class");
        obj2.display();
        System.out.println("Making a Batman object with Singleton Class");
        Singleton obj3 = Singleton.Singleton("Batman");
        obj3.display();
        StaticClass.NestedClass obj4 = new StaticClass.NestedClass();
        System.out.println("Nested Class is the Inner class also an example of Nested Class");
    }
}
