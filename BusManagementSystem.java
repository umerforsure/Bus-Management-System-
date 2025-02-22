import java.util.Scanner;
import java.util.Arrays;

public class BusManagementSystem {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CityBus cityBus = new CityBus("CB-101", "Yutong", 50, "Lahore to Islamabad");
            TourBus tourBus = new TourBus("TB-202", "Daewoo", 40, "Islamabad to Naran Kaghan");
            ShuttleBus shuttleBus = new ShuttleBus("SB-303", "Toyota", 20, "Rawalpindi to Islamabad");
            SleeperBus sleeperBus = new SleeperBus("SLB-404", "Volvo", 30, "Karachi to Lahore");
            SchoolBus schoolBus = new SchoolBus("SCB-505", "Hino", 60, "School Route");

            FareCalculation fareCalculation = new FareCalculation();
            SeatReservation cityBusReservation = new SeatReservation(cityBus.getCapacity());
            SeatReservation tourBusReservation = new SeatReservation(tourBus.getCapacity());
            SeatReservation shuttleBusReservation = new SeatReservation(shuttleBus.getCapacity());
            SeatReservation sleeperBusReservation = new SeatReservation(sleeperBus.getCapacity());
            SeatReservation schoolBusReservation = new SeatReservation(schoolBus.getCapacity());
            CustomerFeedback feedbackSystem = new CustomerFeedback();

            boolean exit = false;
            while (!exit) {
                System.out.println("\nWelcome to Bus Management System");
                System.out.println("1. View Bus Details");
                System.out.println("2. Calculate Fare");
                System.out.println("3. Reserve Seats");
                System.out.println("4. Provide Feedback");
                System.out.println("5. View Feedback");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        viewBusDetails(scanner, cityBus, tourBus, shuttleBus, sleeperBus, schoolBus);
                        break;

                    case 2:
                        calculateFare(scanner, fareCalculation, cityBus, tourBus, shuttleBus, sleeperBus, schoolBus);
                        break;

                    case 3:
                        reserveSeat(scanner, cityBusReservation, tourBusReservation, shuttleBusReservation, sleeperBusReservation, schoolBusReservation);
                        break;

                    case 4:
                        provideFeedback(scanner, feedbackSystem);
                        break;

                    case 5:
                        viewFeedback(scanner, feedbackSystem);
                        break;

                    case 6:
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    public static void pause(Scanner scanner) {
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
    }

    public static void viewBusDetails(Scanner scanner, CityBus cityBus, TourBus tourBus, ShuttleBus shuttleBus, SleeperBus sleeperBus, SchoolBus schoolBus) {
        System.out.println("\n1. City Bus Details");
        System.out.println("2. Tour Bus Details");
        System.out.println("3. Shuttle Bus Details");
        System.out.println("4. Sleeper Bus Details");
        System.out.println("5. School Bus Details");
        System.out.print("Enter your choice: ");
        int busChoice = Integer.parseInt(scanner.nextLine());
        try {
            switch (busChoice) {
                case 1 -> {
                    cityBus.displayInfo();
                    cityBus.busDetails();
                }
                case 2 -> {
                    tourBus.displayInfo();
                    tourBus.busDetails();
                }
                case 3 -> {
                    shuttleBus.displayInfo();
                    shuttleBus.busDetails();
                }
                case 4 -> {
                    sleeperBus.displayInfo();
                    sleeperBus.busDetails();
                }
                case 5 -> {
                    schoolBus.displayInfo();
                    schoolBus.busDetails();
                }
                default -> System.out.println("Invalid choice.");
            }
        } catch (Exception e) {
            System.out.println("Error displaying bus details: " + e.getMessage());
        }
        pause(scanner);
    }

    public static void calculateFare(Scanner scanner, FareCalculation fareCalculation, CityBus cityBus, TourBus tourBus, ShuttleBus shuttleBus, SleeperBus sleeperBus, SchoolBus schoolBus) {
        System.out.println("\n1. City Bus Fare");
        System.out.println("2. Tour Bus Fare");
        System.out.println("3. Shuttle Bus Fare");
        System.out.println("4. Sleeper Bus Fare");
        System.out.println("5. School Bus Fare");
        System.out.print("Enter your choice: ");
        int fareChoice = Integer.parseInt(scanner.nextLine());
        try {
            switch (fareChoice) {
                case 1 -> {
                    System.out.println("Choose route:");
                    System.out.println("1. Lahore to Islamabad");
                    System.out.println("2. Islamabad to Lahore");
                    int routeChoice = Integer.parseInt(scanner.nextLine());
                    if (routeChoice == 1) {
                        System.out.println("Fare for City Bus (Lahore to Islamabad): " + fareCalculation.calculateFare("Lahore to Islamabad", 250, "Economy"));
                    } else if (routeChoice == 2) {
                        System.out.println("Fare for City Bus (Islamabad to Lahore): " + fareCalculation.calculateFare("Islamabad to Lahore", 250, "Economy"));
                    } else {
                        System.out.println("Invalid route choice.");
                    }
                }
                case 2 -> {
                    System.out.println("Choose route:");
                    System.out.println("1. Islamabad to Naran Kaghan");
                    int routeChoice = Integer.parseInt(scanner.nextLine());
                    if (routeChoice == 1) {
                        System.out.println("Fare for Tour Bus (Islamabad to Naran Kaghan): " + fareCalculation.calculateFare("Islamabad to Naran Kaghan", 300, "Business"));
                    } else {
                        System.out.println("Invalid route choice.");
                    }
                }
                case 3 -> {
                    System.out.println("Choose route:");
                    System.out.println("1. Rawalpindi to Islamabad");
                    int routeChoice = Integer.parseInt(scanner.nextLine());
                    if (routeChoice == 1) {
                        System.out.println("Fare for Shuttle Bus (Rawalpindi to Islamabad): " + fareCalculation.calculateFare("Rawalpindi to Islamabad", 100, "Standard"));
                    } else {
                        System.out.println("Invalid route choice.");
                    }
                }
                case 4 -> {
                    System.out.println("Choose route:");
                    System.out.println("1. Karachi to Lahore");
                    int routeChoice = Integer.parseInt(scanner.nextLine());
                    if (routeChoice == 1) {
                        System.out.println("Fare for Sleeper Bus (Karachi to Lahore): " + fareCalculation.calculateFare("Karachi to Lahore", 500, "Luxury"));
                    } else {
                        System.out.println("Invalid route choice.");
                    }
                }
                case 5 -> {
                    System.out.println("Choose route:");
                    System.out.println("1. School Route");
                    int routeChoice = Integer.parseInt(scanner.nextLine());
                    if (routeChoice == 1) {
                        System.out.println("Fare for School Bus (School Route): " + fareCalculation.calculateFare("School Route", 50, "Economy"));
                    } else {
                        System.out.println("Invalid route choice.");
                    }
                }
                default -> System.out.println("Invalid choice.");
            }
        } catch (Exception e) {
            System.out.println("Error calculating fare: " + e.getMessage());
        }
        pause(scanner);
    }

    public static void reserveSeat(Scanner scanner, SeatReservation... reservations) {
        System.out.println("\n1. Reserve Seat on City Bus");
        System.out.println("2. Reserve Seat on Tour Bus");
        System.out.println("3. Reserve Seat on Shuttle Bus");
        System.out.println("4. Reserve Seat on Sleeper Bus");
        System.out.println("5. Reserve Seat on School Bus");
        System.out.print("Enter your choice: ");
        int reserveChoice = Integer.parseInt(scanner.nextLine());

        try {
            SeatReservation reservation = null;
            String selectedRoute = "";
            int fare = 0;

            // Choose Bus Type
            if (reserveChoice >= 1 && reserveChoice <= reservations.length) {
                reservation = reservations[reserveChoice - 1];

                // Ask for route selection before seats
                System.out.println("Choose a route: ");
                System.out.println("1. Lahore to Islamabad\n2. Islamabad to Naran Kaghan\n3. Rawalpindi to Islamabad\n4. Karachi to Lahore\n5. School Route");
                int routeChoice = Integer.parseInt(scanner.nextLine());

                if (routeChoice >= 1 && routeChoice <= 5) {
                    selectedRoute = reservation.getRoute(routeChoice);
                    fare = reservation.getFare(selectedRoute);
                    System.out.println("You selected route: " + selectedRoute);
                    System.out.println("Fare: " + fare);
                } else {
                    System.out.println("Invalid route choice.");
                    return;
                }

                // Display available seats and allow seat reservation
                reservation.showAvailableSeats();
                System.out.print("Choose from available seats (comma-separated for multiple if needed): ");
                String inputSeats = scanner.nextLine(); // User enters seats like "1, 3, 5"
                String[] selectedSeats = inputSeats.split(",");

                // Process seat selection
                for (String seatStr : selectedSeats) {
                    int seat = Integer.parseInt(seatStr.trim());
                    if (reservation.isSeatAvailable(seat)) { // Check if seat is available
                        reservation.bookSeat(seat); // Book the seat
                    } else {
                        System.out.println("Seat " + seat + " is already reserved or invalid.");
                    }
                }

                // Display final booking details
                System.out.println("\nBooking Summary:");
                System.out.println("Route: " + selectedRoute);
                System.out.println("Fare per seat: Rs. " + fare);
                System.out.println("Seats booked: " + Arrays.toString(selectedSeats));
                System.out.println("Total fare: Rs. " + (fare * selectedSeats.length));
            } else if (reserveChoice == 6) {
                // Add new route
                System.out.print("Enter route ID: ");
                int routeId = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter route name: ");
                String routeName = scanner.nextLine();
                SeatReservation.addRoute(routeId, routeName);
                System.out.println("New route added successfully.");
            } else if (reserveChoice == 7) {
                // Add new fare
                System.out.print("Enter route name to add fare: ");
                String routeName = scanner.nextLine();
                System.out.print("Enter fare amount: ");
                int fareAmount = Integer.parseInt(scanner.nextLine());
                SeatReservation.addFare(routeName, fareAmount);
                System.out.println("New fare added successfully.");
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (Exception e) {
            System.out.println("Error reserving seat: " + e.getMessage());
        }
        pause(scanner);
    }

    public static void provideFeedback(Scanner scanner, CustomerFeedback feedbackSystem) {
        // Ask for bus type
        System.out.println("Select the type of bus:");
        System.out.println("1. City Bus");
        System.out.println("2. Tour Bus");
        System.out.println("3. Shuttle Bus");
        System.out.println("4. Sleeper Bus");
        System.out.println("5. School Bus");
        int busChoice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        // Ask for route
        System.out.println("Choose a route:");
        System.out.println("1. Lahore to Islamabad");
        System.out.println("2. Islamabad to Naran Kaghan");
        System.out.println("3. Rawalpindi to Islamabad");
        System.out.println("4. Karachi to Lahore");
        System.out.println("5. School Route");
        int routeChoice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        System.out.println("You selected bus type: " + getBusType(busChoice) + " and route: " + getRoute(routeChoice));

        // Ask for feedback
        System.out.print("Enter feedback: ");
        String feedback = scanner.nextLine();
        try {
            feedbackSystem.addFeedback(feedback);
            System.out.println("Feedback added successfully.");
        } catch (Exception e) {
            System.out.println("Error adding feedback: " + e.getMessage());
        }
        pause(scanner);
    }

    private static String getBusType(int busChoice) {
        switch (busChoice) {
            case 1:
                return "City Bus";
            case 2:
                return "Tour Bus";
            case 3:
                return "Shuttle Bus";
            case 4:
                return "Sleeper Bus";
            case 5:
                return "School Bus";
            default:
                return "Unknown Bus";
        }
    }

    private static String getRoute(int routeChoice) {
        switch (routeChoice) {
            case 1:
                return "Lahore to Islamabad";
            case 2:
                return "Islamabad to Naran Kaghan";
            case 3:
                return "Rawalpindi to Islamabad";
            case 4:
                return "Karachi to Lahore";
            case 5:
                return "School Route";
            default:
                return "Unknown Route";
        }
    }


    public static void viewFeedback(Scanner scanner, CustomerFeedback feedbackSystem) {
        // Ask for bus type
        System.out.println("Select the type of bus:");
        System.out.println("1. City Bus");
        System.out.println("2. Tour Bus");
        System.out.println("3. Shuttle Bus");
        System.out.println("4. Sleeper Bus");
        System.out.println("5. School Bus");
        int busChoice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        // Ask for route
        System.out.println("Choose a route:");
        System.out.println("1. Lahore to Islamabad");
        System.out.println("2. Islamabad to Naran Kaghan");
        System.out.println("3. Rawalpindi to Islamabad");
        System.out.println("4. Karachi to Lahore");
        System.out.println("5. School Route");
        int routeChoice = scanner.nextInt();
        scanner.nextLine();  // Consume the newline

        System.out.println("You selected bus type: " + getBusType(busChoice) + " and route: " + getRoute(routeChoice));

        try {
            feedbackSystem.displayFeedback();
        } catch (Exception e) {
            System.out.println("Error displaying feedback: " + e.getMessage());
        }
        pause(scanner);
    }
}