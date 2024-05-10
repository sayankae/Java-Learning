import java.util.Scanner;

public class ThrowsKeyword {
    final static int MIN_VOTING_AGE = 18;

    static void makeVotingCard(int age) throws Exception {
        if (age < MIN_VOTING_AGE) {
            throw new Exception("Current age is less than Eligible Voting Age.");
        } else {
            System.out.println("Successfully created Voting Card");
        }
    }

    public static void main(String[] args) {
        System.out.println("Throws keyword helps method to understand any particular type of Exception to handle.");
        System.out.println("Simple throws");
        System.out.println("Enter Age");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        scan.close();
        try {
            makeVotingCard(age);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
