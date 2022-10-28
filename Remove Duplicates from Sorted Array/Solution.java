class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1,val=nums[0];
        for(int i=1;i<nums.length;i++){
            if(val!=nums[i]){
                nums[k]=nums[i];
                val=nums[i];
                k++;
            }
        }
        return k;
    }
}