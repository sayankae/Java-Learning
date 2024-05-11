public class ExceptionCause {
    public static void main(String[] args) {
        System.out.println("Cause helps to provide some info about the primary cause of Error");
        int a = 43;
        int b = 0;
        try {
            if (b == 0) {
                Exception e = new Exception();
                UnsupportedOperationException uoe = new UnsupportedOperationException("Cant divide it with 0");
                e.initCause(uoe);
                throw e;
            } else {
                a = a / b;
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getCause());
        }

    }
}
