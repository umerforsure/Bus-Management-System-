import java.util.*;

public class SeatReservation {
    private List<Integer> availableSeats;
    private static final HashMap<Integer, String> routes = new HashMap<>();
    private static final HashMap<String, Integer> fares = new HashMap<>();

    static {
        routes.put(1, "Lahore to Islamabad");
        routes.put(2, "Islamabad to Naran Kaghan");
        routes.put(3, "Rawalpindi to Islamabad");
        routes.put(4, "Karachi to Lahore");
        routes.put(5, "School Route");

        fares.put("Lahore to Islamabad", 250);
        fares.put("Islamabad to Naran Kaghan", 300);
        fares.put("Rawalpindi to Islamabad", 100);
        fares.put("Karachi to Lahore", 500);
        fares.put("School Route", 50);
    }

    public SeatReservation(int totalSeats) {
        availableSeats = new ArrayList<>();
        for (int i = 1; i <= totalSeats; i++) {
            availableSeats.add(i);
        }
    }

    public void showAvailableSeats() {
        System.out.println("Available seats: " + availableSeats);
    }

    public boolean isSeatAvailable(int seatNumber) {
        return availableSeats.contains(seatNumber);
    }

    public void bookSeat(int seatNumber) {
        if (isSeatAvailable(seatNumber)) {
            availableSeats.remove(Integer.valueOf(seatNumber));
            System.out.println("Seat " + seatNumber + " has been booked.");
        } else {
            System.out.println("Seat " + seatNumber + " is already reserved or invalid.");
        }
    }

    public String getRoute(int routeChoice) {
        return routes.get(routeChoice);
    }

    public int getFare(String route) {
        return fares.getOrDefault(route, 0);
    }

    public static void addRoute(int routeId, String routeName) {
        routes.put(routeId, routeName);
    }

    public static void addFare(String routeName, int fareAmount) {
        fares.put(routeName, fareAmount);
    }
}
