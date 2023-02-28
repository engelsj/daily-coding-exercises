package solutions;

import java.util.HashMap;

public class TwoNumberSum {
    public int[] findTwoNumberSum(int[] n, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n.length; i++){
            if(map.containsKey(k - n[i])){
                return new int[] {map.get(k - n[i]), n[i]};
            }
            else{
                map.put(n[i], i);
            }
        }
        return new int[] {};
    }
}
