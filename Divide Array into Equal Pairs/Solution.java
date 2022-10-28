class Solution {
    public boolean divideArray(int[] nums) {
        int[] count=new int[501];
        for(int i:nums){
            count[i]++;
        }
        for(int i:count){
            if((i&1)==1){
                return false;
            }
        }
        return true;
    }
}