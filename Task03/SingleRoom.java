
// SingleRoom class, inheriting from Room
public class SingleRoom extends Room {
    // Constructor to initialize SingleRoom
    public SingleRoom(String roomNumber, double price) {
        super(roomNumber, price);
    }

    // Override method to provide room description
    @Override
    public String getRoomDescription() {
        return "Single Room - " + getRoomNumber() + " - $" + getPrice();
    }
}