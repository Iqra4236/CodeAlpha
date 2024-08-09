// Reservation class to represent a reservation
public class Reservation {
    private String reservationID; // Unique reservation ID
    private Room room; // Room associated with the reservation
    private String customerName; // Name of the customer
    private String checkInDate; // Check-in date
    private String checkOutDate; // Check-out date

    // Constructor to initialize the reservation
    public Reservation(String reservationID, Room room, String customerName, String checkInDate, String checkOutDate) {
        this.reservationID = reservationID;
        this.room = room;
        this.customerName = customerName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Getter for reservation ID
    public String getReservationID() {
        return reservationID;
    }

    // Getter for room
    public Room getRoom() {
        return room;
    }

    // Getter for customer name
    public String getCustomerName() {
        return customerName;
    }

    // Getter for check-in date
    public String getCheckInDate() {
        return checkInDate;
    }

    // Getter for check-out date
    public String getCheckOutDate() {
        return checkOutDate;
    }

    // Override toString method to represent reservation details
    @Override
    public String toString() {
        return "Reservation ID: " + reservationID + "\n" +
               "Room: " + room.getRoomDescription() + "\n" +
               "Customer: " + customerName + "\n" +
               "Check-in Date: " + checkInDate + "\n" +
               "Check-out Date: " + checkOutDate;
    }
}
