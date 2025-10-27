package Rooms;

public class StandardRoom extends Room {

    public StandardRoom(String roomNumber, int baseRate) {
        super(roomNumber, baseRate);
    }

    @Override
    public String getDescription() {
        return "Standard Rooms.";
    }
}
