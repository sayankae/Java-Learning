public class TrowKeyword {
    public static void main(String[] args) {
        System.out.println("Throw helps create exception object with custom message.");
        System.out.println("Simple throw");
        final int MIN_VOTING_AGE = 18;
        int age = 17;
        try {
            if (age < MIN_VOTING_AGE) {
                throw new Exception("Current age is less than Eligible Voting Age.");
            } else {
                System.out.println("Eligible for voting.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
