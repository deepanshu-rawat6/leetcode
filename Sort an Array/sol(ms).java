class Solution {
    /*
    Using merge sort(in-place) which is taking TC:O(NlogN)
    */
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length);
        return nums;
    }
    public void sort(int[] nums,int s,int e){
       if(e-s==1){
           return;
       }
        int mid=s+(e-s)/2;
        sort(nums,s,mid);
        sort(nums,mid,e);
        merge(nums,s,mid,e);
    }
    public void merge(int[] nums,int s,int mid,int e){
        int[] mix=new int[e-s];
        int i=s,j=mid,k=0;
        while(i<mid && j<e){
            if(nums[i]>nums[j]){
                mix[k]=nums[j];
                j++;
            }else{
                mix[k]=nums[i];
                i++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=nums[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=nums[j];
            j++;
            k++;
        }
        for(int l=0;l<(e-s);l++){
            nums[s+l]=mix[l];
        }
    }
    public void swap(int[] arr,int s,int e){
        int temp=arr[e];
        arr[e]=arr[s];
        arr[s]=temp;
    }
}