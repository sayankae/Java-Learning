import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String s) {
        super("Current age " + s + " is less than Eligible Voting Age.");
    }
}

public class CustomException {
    final static int MIN_VOTING_AGE = 18;

    static void makeVotingCard(int age) throws AgeException {
        if (age < MIN_VOTING_AGE) {
            throw new AgeException(age + "");
        } else {
            System.out.println("Successfully created Voting Card");
        }
    }

    public static void main(String[] args) {
        System.out.println("Custom Exception helps extend Exception Class and add more properties if needed");
        System.out.println("Custom Exception");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = scan.nextInt();
        scan.close();
        try {
            makeVotingCard(age);
        } catch (AgeException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Thanks for reaching out to Election Office.");
        }
    }
}
