package solutions;

public class MissingPositiveInteger {

    public int firstMissingPositive(int[] nums){
        int n = nums.length;
        int i = 0;
        // put each element in the range of 1 to n in their correct position
        while(i < n){
            int a = nums[i];
            if(a>=1 && a <=n){
                if(nums[a-1] != a){
                    nums[i] = nums[a-1];
                    nums[a-1]=a;
                }
                else
                    i++;
            }
            else{
                i++;
            }
        }
        // then the first element which does not match its position is the result
        for(int j=0; j< n; j++){
            if(nums[j]!=j+1)
                return j + 1;
        }
        return n + 1;
    }
}
