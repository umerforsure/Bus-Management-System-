public abstract class Bus {
    protected String busNumber;
    protected String model;
    protected int capacity;
    protected String route;

    public Bus(String busNumber, String model, int capacity, String route) {
        this.busNumber = busNumber;
        this.model = model;
        this.capacity = capacity;
        this.route = route;
    }

    public abstract void busDetails();

    public void displayInfo() {
        System.out.println("Bus Number: " + busNumber);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity + " seats");
    }

    public void updateInfo(String newModel, int newCapacity) throws InvalidBusInfoException {
        if (newCapacity <= 0) {
            throw new InvalidBusInfoException("Bus capacity must be a positive number.");
        }
        this.model = newModel;
        this.capacity = newCapacity;
    }


    public int getCapacity() {
        return capacity;
    }
}
