package Services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GymServiceTest {

    @Test
    public void testGetCost() {
        Service service = new GymService();
        assertEquals(30, service.getCost());
    }

    @Test
    public void testGetName() {
        Service service = new GymService();
        assertEquals("Gym Services.", service.getName());
    }
}
