import org.junit.Test;

import static org.junit.Assert.*;


public class MinusTest {

    @Test
    public void minusOfIntegerValuesShouldReturnIntegerValue() {
        assertEquals(3, Calculator.minus(13, 10));
    }
}
