package Rooms;

public class SuiteRoom extends Room {

    public SuiteRoom(String roomNumber, int baseRate) {
        super(roomNumber, baseRate);
    }

    @Override
    public String getDescription() {
       String description = "Suite Rooms.";
        System.out.println(description);
        return description;
    }
}
