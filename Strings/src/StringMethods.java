public class StringMethods {

    private static void createString(){
        String s = new String();
        System.out.println("Created Empty String. "+s);
        s = new String("Hello");
        System.out.println("Created String by passing Original String. "+s);
        char []arr = {'C','H','A','R','A','C','T','E','R',' ','A','R','R','A','Y'};
        s = new String(arr);
        System.out.println("Created String by passing Character Array. "+s);
        byte [] newarr = {65,83,67,73,73,32,65,82,82,65,89};
        s = new String(newarr);
        System.out.println("Created String by passing Byte Array. "+s);
    }

    private static void stringMethods(){

    }

    public static void main(String []args){
        System.out.println("String  Constructor");
        createString();
        System.out.println("String Methods");
        stringMethods();

    }
}
