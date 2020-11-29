import org.junit.Test;

import static org.junit.Assert.*;


public class MaxTest {

    @Test
    public void multiplyOfIntegerValuesShouldReturnIntegerValue() {
        assertEquals(14, Calculator.multiply(7, 2));
    }

}
