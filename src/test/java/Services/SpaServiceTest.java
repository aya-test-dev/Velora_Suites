package Services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpaServiceTest {

    @Test
    public void testGetCost() {
        Service service = new SpaService();
        assertEquals(100, service.getCost());
    }

    @Test
    public void testGetName() {
        Service service = new SpaService();
        assertEquals("Spa Services.", service.getName());
    }
}
