class Solution {
    public int arraySign(int[] nums) {
        long prod=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) nums[i]=-1;
            if(nums[i]>0) nums[i]=1;
            prod*=nums[i];
        }
        return signFunc(prod);
    }
    public int signFunc(long x){
        if(x>0) return 1;
        else if(x<0) return -1;
        return 0;
    }
}