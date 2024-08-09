import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// HotelReservationSystem class to manage the reservation system
public class HotelReservationSystem {
    private List<Room> rooms; // List to store rooms
    private List<Reservation> reservations; // List to store reservations

    // Constructor to initialize the system
    public HotelReservationSystem() {
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    // Method to add a room to the system
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Method to make a reservation
    public void makeReservation(Room room, String customerName, String checkInDate, String checkOutDate, PaymentProcessor paymentProcessor) {
        if (room.isAvailable()) {
            String reservationID = "R" + (reservations.size() + 1);
            Reservation reservation = new Reservation(reservationID, room, customerName, checkInDate, checkOutDate);
            reservations.add(reservation);
            room.setAvailable(false);
            paymentProcessor.processPayment(room.getPrice());
            System.out.println("Reservation made successfully!\n" + reservation);
        } else {
            System.out.println("Room " + room.getRoomNumber() + " is not available.");
        }
    }

    // Method to view all reservations
    public void viewReservations() {
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
            System.out.println("----------------------------");
        }
    }

    // Method to search for available rooms
    public void searchRooms() {
        for (Room room : rooms) {
            if (room.isAvailable()) {
                System.out.println(room.getRoomDescription());
            }
        }
    }

    // Method to initialize the system with some rooms and start interaction
    public void initialize() {
        // Adding rooms to the system
        addRoom(new SingleRoom("101", 100));
        addRoom(new DoubleRoom("102", 150));
        addRoom(new SuiteRoom("103", 250));

        Scanner scanner = new Scanner(System.in);

        // Command-line interaction with the user
        while (true) {
            System.out.println("1. Search Rooms");
            System.out.println("2. Make Reservation");
            System.out.println("3. View Reservations");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    searchRooms();
                    break;
                case 2:
                    System.out.print("Enter room number: ");
                    String roomNumber = scanner.next();
                    Room roomToReserve = null;
                    for (Room room : rooms) {
                        if (room.getRoomNumber().equals(roomNumber)) {
                            roomToReserve = room;
                            break;
                        }
                    }
                    if (roomToReserve != null) {
                        System.out.print("Enter customer name: ");
                        String customerName = scanner.next();
                        System.out.print("Enter check-in date (YYYY-MM-DD): ");
                        String checkInDate = scanner.next();
                        System.out.print("Enter check-out date (YYYY-MM-DD): ");
                        String checkOutDate = scanner.next();
                        System.out.println("Choose payment method: ");
                        System.out.println("1. Credit Card");
                        System.out.println("2. PayPal");
                        int paymentChoice = scanner.nextInt();
                        PaymentProcessor paymentProcessor = null;
                        if (paymentChoice == 1) {
                            paymentProcessor = new CreditCardPayment();
                        } else if (paymentChoice == 2) {
                            paymentProcessor = new PayPalPayment();
                        }
                        if (paymentProcessor != null) {
                            makeReservation(roomToReserve, customerName, checkInDate, checkOutDate, paymentProcessor);
                        }
                    } else {
                        System.out.println("Room not found.");
                    }
                    break;
                case 3:
                    viewReservations();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
