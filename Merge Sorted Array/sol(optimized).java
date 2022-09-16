import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for the arrays
        int i=0,j=0,k=0;
        // Creating a duplicate array into temp
        int[] temp= Arrays.copyOfRange(nums1, 0, m);
        while(i<m && j<n){
            // comparing elements, and adding then into nums1[] 
            if(temp[i]<nums2[j]){
                nums1[k]=temp[i];
                i++;
            }else{
                nums1[k]=nums2[j];
                j++;
            }
            k++;
        }
        // adding the left out, elements into respective arrays where i or j
        // is less than their respective arrays lengths. 
        while(i<m){
            nums1[k]=temp[i];
            k++;
            i++;
        }
        while(j<n){
            nums1[k]=nums2[j];
            k++;
            j++;
        }
    }
}