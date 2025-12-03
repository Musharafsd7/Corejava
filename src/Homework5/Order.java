package Homework5;

public class Order {
    static int discount = 10;
    int price;

    Order(int p) {
        price = p;
    }

    int applyDiscount() {
        return price - (price * discount / 100);
    }

    public static void main(String[] args) {
        Order o = new Order(1000);
        System.out.println("Final Price: " + o.applyDiscount());
    }
}
