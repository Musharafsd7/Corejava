package Homework4;

public class VotingEligibilityMethod {
    public static void main(String[] args) {
        int age = 20;
        if (isEligibleToVote(age)) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }
}
