import org.junit.Test;

import static org.junit.Assert.*;


public class MinTest {

    @Test
    public void minOfIntegerValuesShouldReturnIntegerValue() {
        assertEquals(4, Calculator.min(4, 10));
    }

}
