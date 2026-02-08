package Services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiningServiceTest {

    @Test
    public void testGetCost() {
        Service service = new DiningService();
        assertEquals(50, service.getCost());
    }

    @Test
    public void testGetName() {
        Service service = new DiningService();
        assertEquals("Dining Services.", service.getName());
    }
}
