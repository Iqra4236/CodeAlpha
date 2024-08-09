// Abstract Room class to represent a room in the hotel
public abstract class Room {
    private String roomNumber; // Room number
    private double price; // Room price per night
    private boolean isAvailable; // Availability status of the room

    // Constructor to initialize the room
    public Room(String roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isAvailable = true; // Initially, the room is available
    }

    // Getter for room number
    public String getRoomNumber() {
        return roomNumber;
    }

    // Getter for room price
    public double getPrice() {
        return price;
    }

    // Getter for availability status
    public boolean isAvailable() {
        return isAvailable;
    }

    // Setter for availability status
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Abstract method to get the room description
    public abstract String getRoomDescription();
}