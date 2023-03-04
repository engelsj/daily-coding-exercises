package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingPositiveIntegerTest {

    @Test
    public void testFirstMissingPositive(){
        MissingPositiveInteger missingPositiveInteger = new MissingPositiveInteger();
        assertEquals(2, missingPositiveInteger.firstMissingPositive(new int[] {3, 4, -1, 1}));
        assertEquals(3, missingPositiveInteger.firstMissingPositive(new int[] {1, 2, 0}));
    }

}