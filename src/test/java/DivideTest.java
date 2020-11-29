import org.junit.Test;

import static org.junit.Assert.*;


public class DivideTest {

    @Test
    public void divideOfIntegerValuesShouldReturnIntegerValue() {
        assertEquals(3, Calculator.divide(30, 10));
    }

}
