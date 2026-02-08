package Rooms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Services.DiningService;
import Services.SpaService;
import Services.GymService;

public class DeluxeRoomTest {

    @Test
    public void testGetRoomNumber() {
        DeluxeRoom room = new DeluxeRoom("301", 300);
        assertEquals("301", room.getRoomNumber());
    }

    @Test
    public void testGetTotalCostWithoutServices() {
        DeluxeRoom room = new DeluxeRoom("301", 300);
        assertEquals(300f, room.getTotalCost(), 0.001f);
    }

    @Test
    public void testGetTotalCostWithServices() {
        DeluxeRoom room = new DeluxeRoom("301", 300);
        room.addService(new SpaService());
        room.addService(new DiningService());
        assertEquals(450f, room.getTotalCost(), 0.001f);
    }

    @Test
    public void testGetDescription() {
        DeluxeRoom room = new DeluxeRoom("301", 300);
        assertEquals("Deluxe Rooms.", room.getDescription());
    }
}
