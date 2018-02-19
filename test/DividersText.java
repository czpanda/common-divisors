import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class DividersText {

    @Test
    public void testDividersList() {
        List<Integer> dividers = Dividers.dividersList(20);

        assertTrue(dividers.contains(2));
        assertTrue(dividers.contains(4));
        assertTrue(dividers.contains(5));
        assertTrue(dividers.contains(10));
        assertTrue(dividers.contains(20));
        assertEquals(5, dividers.size());
    }

    @Test
    public void testGreatestCommonDivisors() {
        assertEquals(10, Dividers.greatestCommonDivisor(30, 20));
        assertEquals(5, Dividers.greatestCommonDivisor(5, 10));
    }
}
