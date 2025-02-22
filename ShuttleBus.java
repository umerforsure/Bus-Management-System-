import java.util.List;

public class ShuttleBus extends Bus implements BusRoute {
    private static final List<String> routes = List.of(
            "Islamabad Airport to Rawalpindi",
            "Karachi Airport to Saddar",
            "Lahore Airport to Mall Road",
            "Faisalabad to Motorway Interchange",
            "Peshawar to Hayatabad");

    public ShuttleBus(String busNumber, String model, int capacity, String route) {
        super(busNumber, model, capacity, route);
    }

    @Override
    public void busDetails() {
        System.out.println("This is a Shuttle Bus operating on route: " + route);
    }

    @Override
    public void showRoutes() {
        System.out.println("Available Shuttle Bus Routes:");
        for (int i = 0; i < routes.size(); i++) {
            System.out.println((i + 1) + ". " + routes.get(i));
        }
    }
}
