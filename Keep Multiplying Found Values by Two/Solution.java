import java.util.HashSet;

class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(;;){
            if(!set.contains(original)){
                return original;
            }
            original*=2;
        }
    }
}