public class CityBus extends Bus implements BusRoute {
    private String route;

    public CityBus(String busNumber, String model, int capacity, String route) {
        super(busNumber, model, capacity, route);
        this.route = route;
    }

    @Override
    public void busDetails() {
        System.out.println("This is a City Bus operating on route: " + route);
    }

    @Override
    public void showRoutes() {
        System.out.println("Available City Bus Routes:");
        System.out.println("1. Lahore to Islamabad");
        System.out.println("2. Karachi to Lahore");
        System.out.println("3. Peshawar to Rawalpindi");
        System.out.println("4. Quetta to Karachi");
        System.out.println("5. Multan to Faisalabad");
    }

    public String getRoute() {
        return route;
    }
}
