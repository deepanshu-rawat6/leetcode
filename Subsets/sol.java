package Subsets;

import java.util.ArrayList;
import java.util.List;

/*
 * Learning to generate subsets of distinct elements from Kunal Kushwaha
 */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=subset(nums);
        return ans;
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}