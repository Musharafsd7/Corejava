package Homework5;

public class BusTicket {
    static String company = "IRCTC";
    String passenger;
    int fare;

    BusTicket(String p, int f) {
        passenger = p;
        fare = f;
    }

    public static void main(String[] args) {
        BusTicket t = new BusTicket("Mohammed", 500);

        System.out.println("Passenger: " + t.passenger);
        System.out.println("Ticket Fare: " + t.fare);
        System.out.println("Company: " + company);
    }
}
