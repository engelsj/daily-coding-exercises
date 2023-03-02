package solutions;

public class ProductExceptSelf {
    public int[] findProductExceptSelf(int[] nums){
        // resulting list that we will return
        int[] result = new int[nums.length];
        // starting counts for the values we will start the multiplication with
        int right = 1;
        int left = 1;
        // start for the beginning of the array
        for(int i = 0; i < nums.length; i++){
            // set the index we are looking at to our rolling left value
            result[i] = left;
            // multiply left by the number we are looking at right now
            left *= nums[i];
        }
        // starting from the end of the list, do the same process but in reverse
        for(int i = nums.length - 1; i >= 0; i--){
            result[i] *= right;
            right *= nums[i];
        }
        // the result is that at index N, we first set the value to the product of all the values to its left
        // and then multiply it by all the values to the right of it
        return result;
    }
}
