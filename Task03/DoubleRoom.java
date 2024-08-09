// DoubleRoom class, inheriting from Room
public class DoubleRoom extends Room {
    // Constructor to initialize DoubleRoom
    public DoubleRoom(String roomNumber, double price) {
        super(roomNumber, price);
    }

    // Override method to provide room description
    @Override
    public String getRoomDescription() {
        return "Double Room - " + getRoomNumber() + " - $" + getPrice();
    }
}