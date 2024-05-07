public class TypeCasting {

    static void automaticCasting() {
        System.out.println("Automatic Casting from smaller size to larger size");
        char c = 'c';
        System.out.println("Data type is Character " + c);
        byte bit = 2;
        System.out.println("Data type is Byte " + bit);
        short sht = bit;
        System.out.println("Casting to Short from Byte " + sht);
        int i = c;
        System.out.println("Casting to Integer from Character " + i);
        long l = i;
        System.out.println("Casting to Long from Integer " + l);
        float f = l;
        System.out.println("Casting to Float from Long " + f);
        double d = f;
        System.out.println("Casting to Double from Float " + d);
    }

    static void casting() {
        System.out.println("Type Casting incompatible types");
        double d = 5.0d;
        System.out.println("Data type is Double " + d);
        float f = (float) d;
        System.out.println("Casting to Float from Double " + f);
        long l = (long) f;
        System.out.println("Casting to Long from Float " + l);
        int i = (int) l;
        System.out.println("Casting to Integer from Long " + i);
        short sht = (short) i;
        System.out.println("Casting to Short from Integer " + sht);
        byte bit = (byte) sht;
        System.out.println("Casting to Byte from Short " + bit);
        char c = (char) bit;
        System.out.println("Casting to Character from Byte" + c);
    }


    public static void main(String[] args) {
        automaticCasting();
        casting();
    }
}
