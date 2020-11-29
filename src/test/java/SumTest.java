import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void sumOfIntegerValuesShouldReturnIntegerValue() {
        assertEquals(13, Calculator.sum(3, 10));
    }

}
