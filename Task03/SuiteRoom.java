
// SuiteRoom class, inheriting from Room
public class SuiteRoom extends Room {
    // Constructor to initialize SuiteRoom
    public SuiteRoom(String roomNumber, double price) {
        super(roomNumber, price);
    }

    // Override method to provide room description
    @Override
    public String getRoomDescription() {
        return "Suite Room - " + getRoomNumber() + " - $" + getPrice();
    }
}