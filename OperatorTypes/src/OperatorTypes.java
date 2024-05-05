public class OperatorTypes {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println("a is " + a + " b is " + b);

        System.out.println("Arithmetic Operator");
        System.out.println("a + b = " + (a + b));
        System.out.println("b - a = " + (b - a));
        System.out.println("b / a = " + (b / a));
        System.out.println("a * b = " + (a * b));
        System.out.println("a % b = " + (a % b));

        System.out.println("Unary Operator");
        System.out.println("a++ = " + a++);
        System.out.println("++b = " + ++b);
        System.out.println("a-- = " + a--);
        System.out.println("--b = " + --b);

        System.out.println("a is " + a + " b is " + b);

        System.out.println("Assignment Operator");
        System.out.println("Compound Statement");
        System.out.println("a += b = " + (a += b));
        System.out.println("a -= b = " + (a -= b));
        System.out.println("b /= a = " + (b /= a));
        System.out.println("a *= b = " + (a *= b));
        System.out.println("a %= b = " + (a %= b));

        System.out.println("a is " + a + " b is " + b);

        System.out.println("Relational Operator");
        System.out.println("Is a is greater than b " + (a > b));
        System.out.println("Is a is greater than or equals to b " + (a >= b));
        System.out.println("Is a is less than b " + (a < b));
        System.out.println("Is a is less than or equal to b " + (a <= b));
        System.out.println("Is a is equal to b " + (a == b));
        System.out.println("Is a is not equal to b " + (a != b));

        boolean x = true;
        boolean y = false;
        System.out.println("x is " + x + " y is " + y);

        System.out.println("Logical Operator");
        System.out.println("Logical AND x && y is " + (x && y));
        System.out.println("Logical OR x || y is " + (x || y));
        System.out.println("Logical NOT !x is " + (!x));

        System.out.println("Ternary Operator");
        System.out.println("If a is greater than b print a else print b = " + (a > b ? "a" : "b"));

        System.out.println("Bitwise Operator");
        System.out.println("Bitwise unsigned shift a>>>1 = " + (a >>> 1));
        System.out.println("Bitwise left shift b<<1 = " + (b << 1));
        System.out.println("Bitwise right shift b>>1 = " + (b >> 1));
        System.out.println("Bitwise OR a | b = " + (a | b));
        System.out.println("Bitwise AND a & b = " + (a & b));
        System.out.println("Bitwise XOR a^b = " + (a ^ b));
        System.out.println("Bitwise 1s Complement of b = " + (~b));

        System.out.println("Instance of operator");
        System.out.println("Is obj is the instance of OperatorTypes Class " + (new OperatorTypes() instanceof OperatorTypes));

    }
}