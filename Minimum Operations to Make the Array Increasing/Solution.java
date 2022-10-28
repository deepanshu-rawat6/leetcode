class Solution {
    public int minOperations(int[] nums) {
        int len=nums.length;
        if(len==1){
            return 0;
        }
        int ans=0,prev=0;
        for(int i=0;i<len;i++){
            if(prev>=nums[i]){
                ans+= ++prev-nums[i];
            }else{
                prev=nums[i];
            }
        }
        return ans;
    }
}