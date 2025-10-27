package Rooms;

public class DeluxeRoom extends Room {

    public DeluxeRoom(String roomNumber, int baseRate) {
        super(roomNumber, baseRate);
    }

    @Override
    public String getDescription() {
        String description = "Deluxe Rooms.";
        System.out.println(description);
        return description;
    }
}
