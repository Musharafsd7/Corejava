package Homework5;

public class Car {
    static int carCount = 0;
    String name;

    Car(String n) {
        name = n;
        carCount++;
    }

    public static void main(String[] args) {
        new Car("BMW");
        new Car("Audi");
        new Car("Kia");

        System.out.println("Total Cars Sold: " + carCount);
    }
}
