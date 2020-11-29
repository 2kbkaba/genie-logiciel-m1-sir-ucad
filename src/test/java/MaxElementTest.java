import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxElementTest {

    @Test
    public void maxElementOfListIntegerValuesShouldReturnIntegerValue() {
        int[] numbers = {3, 4, 6, 2, 1, 6, 9};
        assertEquals(9, Calculator.maxElement(numbers));
    }

}
