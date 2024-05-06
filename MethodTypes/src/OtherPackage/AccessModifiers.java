package OtherPackage;

import ThisPackage.MainClass;

class ChildOf extends MainClass {
    public void show() {

        System.out.println("Cannot inherit Default properties outside Package");
/*
        System.out.println(this.a);  Because these properties are Default and cannot be
        this.someFunctionA();        accessed outside the package.
*/

        System.out.println(this.b);
        this.someFunctionB();

        System.out.println(this.c);
        this.someFunctionC();

        System.out.println("Cannot inherit Private properties outside Class");
/*
        System.out.println(this.d); Because these properties are Private and cannot be
        this.someFunctionD();       accessed outside the class.
*/
    }
}

public class AccessModifiers {

    static void show(MainClass obj) throws Exception {

/*
        System.out.println(obj.a);  Because these properties are Default and cannot be
        obj.someFunctionA();        accessed outside the package.
*/

        System.out.println("Can be directly accessed through '.' " + obj.b);
        obj.someFunctionB();

/*
        System.out.println(obj.c); Because these properties are Protected and cannot be
        obj.someFunctionC();       accessed outside the package.

        System.out.println(obj.d); Because these properties are Private and cannot be
        obj.someFunctionD();       accessed outside the package.
*/
    }

    public static void main(String[] args) throws Exception {
        MainClass obj = new MainClass();
        System.out.println("Reference of Main Class");
        show(obj);
        ChildOf mainClass = new ChildOf();
        System.out.println("Reference of child of Main Class");
        mainClass.show();
    }
}
