class Solution {
    /*
    Using quick sort which is taking pivot as median element



    By choosing pivot as corner element results in TLE because TC grows to O(N^2)
    instead of O(NlogN)
    */
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }
    public void sort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=nums[mid];
        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                swap(nums,s,e);
                s++;
                e--;
            }
        }
        sort(nums,low,e);
        sort(nums,s,high);
    }
    public void swap(int[] arr,int s,int e){
        int temp=arr[e];
        arr[e]=arr[s];
        arr[s]=temp;
    }
}