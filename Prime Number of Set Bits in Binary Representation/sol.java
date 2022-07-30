class Solution {
    public int countPrimeSetBits(int left, int right) {
        int c=0;
        HashSet<Integer> set=new HashSet<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
        for(int i=left;i<=right;i++){
            int temp=count_set_bits(i);
            if(set.contains(temp)) c++;
        }
        return c;
    }
    int count_set_bits(int N){
        int c=0;
        while(N>0){
            c++;
            N&=(N-1);
        }
        return c;
    }
}