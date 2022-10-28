class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,ans=0,temp=1;
        for(int i:nums){
            temp&=i;
            c++;
            if(temp==0){
                c=0;
                temp=1;
            }
            ans=Math.max(ans,c);
        }
        return ans;
    }
}