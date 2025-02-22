public class TourBus extends Bus implements BusRoute {
    private String destination;

    public TourBus(String busNumber, String model, int capacity, String destination) {
        super(busNumber, model, capacity, destination);
        this.destination = destination;
    }

    @Override
    public void busDetails() {
        System.out.println("This is a Tour Bus heading to: " + destination);
    }

    @Override
    public void showRoutes() {
        System.out.println("Available Tour Bus Routes:");
        System.out.println("1. Islamabad to Naran Kaghan");
        System.out.println("2. Lahore to Murree");
        System.out.println("3. Karachi to Gwadar");
        System.out.println("4. Rawalpindi to Hunza");
        System.out.println("5. Multan to Skardu");
    }

    public String getDestination() {
        return destination;
    }
}
