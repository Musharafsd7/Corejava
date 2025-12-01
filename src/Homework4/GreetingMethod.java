package Homework4;

public class GreetingMethod {
    public static void main(String[] args) {
        String greeting = greetUser("Ahamed");
        System.out.println(greeting);
    }

    public static String greetUser(String name) {
        return "Hello, " + name + "! Welcome!";
    }
}
