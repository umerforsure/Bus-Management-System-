import java.util.List;

public class SchoolBus extends Bus implements BusRoute {
    private static final List<String> routes = List.of(
            "School Bus Route 1 (Sector F-10)",
            "School Bus Route 2 (G-9)",
            "School Bus Route 3 (H-8)",
            "School Bus Route 4 (F-6)",
            "School Bus Route 5 (G-11)");

    public SchoolBus(String busNumber, String model, int capacity, String route) {
        super(busNumber, model, capacity, route);
    }

    @Override
    public void busDetails() {
        System.out.println("This is a School Bus operating on route: " + route);
    }

    @Override
    public void showRoutes() {
        System.out.println("Available School Bus Routes:");
        for (int i = 0; i < routes.size(); i++) {
            System.out.println((i + 1) + ". " + routes.get(i));
        }
    }
}
