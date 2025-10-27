package Rooms;

public class StandardRoom extends Room {

    public StandardRoom(String roomNumber, int baseRate) {
        super(roomNumber, baseRate);
    }

    @Override
    public String getDescription() {
        String description = "Standard Rooms.";
        System.out.println(description);
        return description;
    }
}
