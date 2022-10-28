class Solution {
    public int maxSubArray(int[] arr) {
        int sum=arr[0],temp=0;
        for(int i=0;i<arr.length;i++){
            temp+=arr[i];
            if(sum<temp){
                sum=temp;
            }
            if(temp<=0){
                temp=0;
            }
        }
        return sum;
    }
}