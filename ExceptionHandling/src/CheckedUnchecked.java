import java.io.File;
import java.util.Scanner;

public class CheckedUnchecked{
    public static void main(String []args){
        System.out.println("This is a type of checked error where programmer can preemptively handle the error before compilation");
        File file = new File("somePathThatDoesNotExist.txt");
        try{
            Scanner scan = new Scanner(file);
        }catch (Exception e){
            System.out.println("If the error was not handled this error will occur at the time of compilation. "+e.getMessage());
        }

        System.out.println("This is a type of unchecked error which may occur during the runtime.");
        try{
            int a = 5;
            int b = 0;
            System.out.println("This is inside try block and its still working here but next line will not show up.");
            int c = a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("If the error is not handled before compilation it will not show error but during runtime it will show this error. "+e.getMessage());
        }


    }
}