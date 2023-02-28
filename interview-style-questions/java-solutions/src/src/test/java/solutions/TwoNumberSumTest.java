package solutions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoNumberSumTest {

    @Test
    public void testTwoNumberSum(){
        TwoNumberSum twoNumberSum = new TwoNumberSum();
        assertEquals(new int[] {0,3} , twoNumberSum.findTwoNumberSum(new int[] {10, 15, 3, 7}, 17));
    }
}