public class ReferenceDataType {
    public static void main(String[] args) {
        String str = new String("This is an object");
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;

        System.out.println("Datatype of Class : " + str.getClass());
        System.out.println("Datatype of Class : " + arr.getClass());
        System.out.println("Datatype of Class : " + new PrimitiveDataType().getClass());
    }
}
