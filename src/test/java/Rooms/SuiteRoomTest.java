package Rooms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Services.DiningService;
import Services.SpaService;
import Services.GymService;

public class SuiteRoomTest {

    @Test
    public void testGetRoomNumber() {
        SuiteRoom room = new SuiteRoom("101", 200);
        assertEquals("101", room.getRoomNumber());
    }

    @Test
    public void testGetTotalCostWithoutServices() {
        SuiteRoom room = new SuiteRoom("101", 200);
        assertEquals(200f, room.getTotalCost(), 0.001f);
    }

    @Test
    public void testGetTotalCostWithServices() {
        SuiteRoom room = new SuiteRoom("101", 200);
        room.addService(new DiningService());
        room.addService(new SpaService());
        assertEquals(350f, room.getTotalCost(), 0.001f);
    }

    @Test
    public void testGetDescription() {
        SuiteRoom room = new SuiteRoom("101", 200);
        assertEquals("Suite Rooms.", room.getDescription());
    }
}
