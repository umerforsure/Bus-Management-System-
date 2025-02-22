public class FareCalculation {


    public double calculateFare(String route, double baseFare, String seatClass) {
        double multiplier = 1.0;


        switch (seatClass.toLowerCase()) {
            case "economy":
                multiplier = 1.0;
                break;
            case "standard":
                multiplier = 1.2;
                break;
            case "business":
                multiplier = 1.5;
                break;
            case "luxury":
                multiplier = 2.0;
                break;
            default:
                System.out.println("Invalid seat class. Defaulting to Economy.");
                multiplier = 1.0;
        }


        double finalFare = baseFare * multiplier;
        return finalFare;
    }

    public static void main(String[] args) {
        FareCalculation fareCalculation = new FareCalculation();


        System.out.println("Testing fare calculation:");
        System.out.println("City Bus (Economy): " + fareCalculation.calculateFare("Lahore to Islamabad", 250, "Economy"));
        System.out.println("Tour Bus (Business): " + fareCalculation.calculateFare("Islamabad to Naran Kaghan", 300, "Business"));
        System.out.println("Shuttle Bus (Standard): " + fareCalculation.calculateFare("Rawalpindi to Islamabad", 100, "Standard"));
        System.out.println("Sleeper Bus (Luxury): " + fareCalculation.calculateFare("Karachi to Lahore", 500, "Luxury"));
        System.out.println("School Bus (Economy): " + fareCalculation.calculateFare("School Route", 50, "Economy"));
    }
}
