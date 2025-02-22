import java.util.List;

public class SleeperBus extends Bus implements BusRoute {
    private static final List<String> routes = List.of(
            "Lahore to Multan (Overnight)",
            "Karachi to Quetta (Overnight)",
            "Rawalpindi to Skardu (Overnight)",
            "Faisalabad to Peshawar",
            "Islamabad to Murree");

    public SleeperBus(String busNumber, String model, int capacity, String route) {
        super(busNumber, model, capacity, route);
    }

    @Override
    public void busDetails() {
        System.out.println("This is a Sleeper Bus going on route: " + route);
    }

    @Override
    public void showRoutes() {
        System.out.println("Available Sleeper Bus Routes:");
        for (int i = 0; i < routes.size(); i++) {
            System.out.println((i + 1) + ". " + routes.get(i));
        }
    }
}
