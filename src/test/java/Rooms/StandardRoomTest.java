package Rooms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Services.DiningService;
import Services.SpaService;
import Services.GymService;

public class StandardRoomTest {

    @Test
    public void testGetRoomNumber() {
        StandardRoom room = new StandardRoom("201", 100);
        assertEquals("201", room.getRoomNumber());
    }

    @Test
    public void testGetTotalCostWithoutServices() {
        StandardRoom room = new StandardRoom("201", 100);
        assertEquals(100f, room.getTotalCost(), 0.001f);
    }

    @Test
    public void testGetTotalCostWithServices() {
        StandardRoom room = new StandardRoom("201", 100);
        room.addService(new GymService());
        room.addService(new DiningService());
        assertEquals(180f, room.getTotalCost(), 0.001f);
    }

    @Test
    public void testGetDescription() {
        StandardRoom room = new StandardRoom("201", 100);
        assertEquals("Standard Rooms.", room.getDescription());
    }
}
