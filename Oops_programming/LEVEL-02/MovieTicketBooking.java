class MovieTicket {
    private final String movieName;  // Movie name doesn't change after initialization
    private String seatNumber;        // Assigned during booking
    private double price;             // Updated during booking

    // Constructor to initialize movie name
    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket successfully booked!");
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("--- Movie Ticket Details ---");
        System.out.println("Movie Name: " + movieName);
        if (seatNumber != null) {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: ₹" + price);
        } else {
            System.out.println("Ticket not booked yet.");
        }
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter Movie Name: ");
            String movieName = sc.nextLine();

            final MovieTicket ticket = new MovieTicket(movieName);

            int choice;
            do {
                System.out.println("\n--- Movie Ticket Booking Menu ---");
                System.out.println("1. Book Ticket");
                System.out.println("2. Display Ticket Details");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Seat Number: ");
                        String seat = sc.nextLine();

                        System.out.print("Enter Ticket Price: ₹");
                        double price = sc.nextDouble();

                        ticket.bookTicket(seat, price);
                    }
                    case 2 -> ticket.displayTicketDetails();
                    case 3 -> System.out.println("Exiting... Thank you!");
                    default -> System.out.println("Invalid option. Try again.");
                }
            } while (choice != 3);
        }
    }
}

