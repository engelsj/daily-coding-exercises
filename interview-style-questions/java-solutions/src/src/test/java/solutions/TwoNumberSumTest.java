package solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoNumberSumTest {

    @Test
    public void testTwoNumberSum(){
        TwoNumberSum twoNumberSum = new TwoNumberSum();
        assertArrayEquals(new int[]{0, 3}, twoNumberSum.findTwoNumberSum(new int[]{10, 15, 3, 7}, 17));
    }
}