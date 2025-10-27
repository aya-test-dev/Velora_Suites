package Rooms;

public class DeluxeRoom extends Room {

    public DeluxeRoom(String roomNumber, int baseRate) {
        super(roomNumber, baseRate);
    }

    @Override
    public String getDescription() {
        return "Deluxe Rooms.";
    }
}
