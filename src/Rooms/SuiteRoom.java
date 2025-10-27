package Rooms;

public class SuiteRoom extends Room {

    public SuiteRoom(String roomNumber, int baseRate) {
        super(roomNumber, baseRate);
    }

    @Override
    public String getDescription() {
       return "Suite Rooms.";
    }
}
