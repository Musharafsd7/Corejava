package Homework4;

public class NameLengthCheckMethod {
    public static void main(String[] args) {
        String result = checkNameLength("Ahamed", "Sd");
        System.out.println("Name Length Check: " + result);
    }

    public static String checkNameLength(String firstName, String lastName) {
        int totalLength = firstName.length() + lastName.length();
        if (totalLength > 10) {
            return "Long Name";
        } else {
            return "Short Name";
        }
    }
}
