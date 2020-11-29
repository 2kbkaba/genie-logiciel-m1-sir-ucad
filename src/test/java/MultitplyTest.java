import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultitplyTest {

    @Test
    public void multiplyOfIntegerValuesShouldReturnIntegerValue() {
        assertEquals(20, Calculator.multiply(4, 5));
    }

}
