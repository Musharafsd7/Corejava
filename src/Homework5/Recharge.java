package Homework5;

public class Recharge {
    String mobileNumber;

    Recharge(String num) {
        mobileNumber = num;
    }

    static String getPlan(int amount) {
        if (amount == 199) {
            return "1.5GB/day, 28 days";
        }
        return "Invalid Plan";
    }

    public static void main(String[] args) {
        Recharge r = new Recharge("9876543210");

        System.out.println("Recharge Successful: " + getPlan(199));
    }
}
