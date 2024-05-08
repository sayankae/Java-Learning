class Example {
    private int val;
    private String name;

    static {
        System.out.println("A class has three main components : ");
        System.out.println("1. Constructor");
        System.out.println("2. Methods");
        System.out.println("3. Variables");
    }

    Example() {
        System.out.println("This is default constructor");
    }

    Example(int val, String name) {
        System.out.println("This is parameterised constructor");
        this.val = val;
        this.name = name;
    }

    public void increment() {
        this.val++;
    }

    public int getVal() {
        return this.val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setName(String s) {
        this.name = s;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Example{" +
                "name='" + name + '\'' +
                ", val=" + val +
                '}';
    }
}

public class ClassDefinition {
    public static void main(String[] args) {
        Example obj = new Example();
        System.out.println(obj);
        obj = new Example(3, "Nike");
        System.out.println(obj);
        System.out.println("Using Getter to access private properties : " + "Value is " + obj.getVal() + " Name is " + obj.getName());
        System.out.println("Using Setter to change the private properties : " + "New Name is Adidas");
        obj.setName("Adidas");
        System.out.println(obj);
    }
}