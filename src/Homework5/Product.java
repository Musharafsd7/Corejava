package Homework5;

public class Product {
    String name;
    int price;

    Product() {
        name = "Unknown";
        price = 0;
    }

    Product(String n, int p) {
        name = n;
        price = p;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Phone", 20000);
        Product p2 = new Product();

        System.out.println("Product: " + p1.name + ", Price: " + p1.price);
        System.out.println("Product: " + p2.name + ", Price: " + p2.price);
    }
}
