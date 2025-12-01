package Homework4;

class Car {
    String brand;
    double price;
}

public class CarObjectMethod {
    public static void main(String[] args) {
        Car car = createCar();
        System.out.println("Car Brand: " + car.brand);
        System.out.println("Car Price: " + car.price);
    }

    public static Car createCar() {
        Car c = new Car();
        c.brand = "Toyota";
        c.price = 1200000;
        return c;
    }
}
