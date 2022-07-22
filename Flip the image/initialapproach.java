class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int k=0;
        int[][] ans=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            k=0;
            for(int j=image[i].length-1;j>=0;j--){
                ans[i][k]=image[i][j]^1;
                k++;
            }
        }
        return ans;
    }
}