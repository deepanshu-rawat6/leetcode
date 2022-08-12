class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] numCount = new int[101];
        for(int i=0 ; i<nums.length ; i++)
            numCount[nums[i]]++;
        
        int count =0;
        int temp ;
        for(int i=0 ; i<numCount.length ; i++){
            if(numCount[i] != 0){
                temp = numCount[i];
                numCount[i] = count ;
                count += temp ;
            }
        }
        
        int[] ans = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++)
            ans[i] = numCount[nums[i]];
        
        return ans ;
    }
}