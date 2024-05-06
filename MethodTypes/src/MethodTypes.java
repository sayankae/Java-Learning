class MethodTypes {

    public static void userDefined(String parameter) {
        System.out.println("This is a static user defined function with parameter " + parameter);
    }

    private String userDefined(String parameter, int a) {
        return "This is a instance user defined function with parameter " + parameter + " " + a;
    }

    public static void main(String[] args) {
        System.out.println("This main method is also a method");
        String parameter = "(This is a parameter)";
        userDefined(parameter);
        System.out.println("This is an instance method " + new MethodTypes().userDefined(parameter, 0));
    }
}