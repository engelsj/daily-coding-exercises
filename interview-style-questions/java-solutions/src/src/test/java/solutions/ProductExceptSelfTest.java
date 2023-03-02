package solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProductExceptSelfTest {

    @Test
    public void testFindTwoNumberSum(){
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();
        assertArrayEquals(new int[]{2, 3, 6}, productExceptSelf.findProductExceptSelf(new int[]{3, 2, 1}));
        assertArrayEquals(new int[]{120, 60, 40, 30, 24}, productExceptSelf.findProductExceptSelf(new int[]{1, 2, 3, 4, 5}));
    }

}