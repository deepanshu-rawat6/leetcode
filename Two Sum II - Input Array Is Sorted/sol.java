lass Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0, e = numbers.length-1;
        int temp = 0;
        while(s <= e){
            int mid = s + (e - s) / 2;
            temp = numbers[s] + numbers[e];
            if (temp == target) return new int[]{s + 1,e + 1};
            
            if (temp < target){
                s++;
            }else{
                e--;
            }
        }
        return new int[]{-1,-1};
    }
}