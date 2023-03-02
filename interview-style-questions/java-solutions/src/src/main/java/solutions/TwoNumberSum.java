package solutions;

import java.util.HashMap;

public class TwoNumberSum {
    public int[] findTwoNumberSum(int[] n, int k){
        // map of value and its corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();
        // iterate over the values in the list
        for(int i = 0; i < n.length; i++){
            // if map already contains the difference between the value we are looking at and the target return it
            if(map.containsKey(k - n[i])){
                // return the index of the second sum and the su, we are looking at
                return new int[] {map.get(k - n[i]), i};
            }
            // otherwise put the value and index into the map
            else{
                map.put(n[i], i);
            }
        }
        // return an empty list if we don't find anything
        return new int[] {};
    }
}
