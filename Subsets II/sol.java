import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Learning to generate subsets of an array with duplicate values from Kunal Kushwaha
 */
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        return subsetDuplicate(nums);
    }
    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i-1]==arr[i]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> inner=new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}