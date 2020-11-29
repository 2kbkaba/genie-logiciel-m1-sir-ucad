import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinElementTest {

    @Test
    public void minElementOfListIntegerValuesShouldReturnIntegerValue() {
        int[] numbers = {3, 4, 6, 2, 1, 6, 9};
        assertEquals(1, Calculator.minElement(numbers));
    }
}
