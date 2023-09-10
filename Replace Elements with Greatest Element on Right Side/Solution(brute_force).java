class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        if (len == 1) {
            arr[0] = -1;
            return arr;
        } else {
            for (int i = 0; i < len - 1; i++) {
                arr[i] = range_max(arr,i + 1,len);
            }
            arr[len - 1] = -1;
            return arr;
        }
    }

    public int range_max(int[] arr, int start, int end) {
        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}