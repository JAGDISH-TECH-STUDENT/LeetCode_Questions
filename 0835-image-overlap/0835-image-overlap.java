class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int max=0;
        for(int row=-n+1;row<n;row++){
            for(int col=-n+1;col<n;col++){
                int count=countOverLap(img1,img2,row,col);
                max=Math.max(max,count);
            }
        }
        return max;
    }
    public int countOverLap(int[][] img1, int[][] img2,int row,int col) {
        int n=img1.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int img2_i =i+row;
                int img2_j=j+col;
                if(img2_i<0 || img2_i>=n || img2_j<0 || img2_j>=n){
                    continue;
                }
                if(img1[i][j]==1 && img2[img2_i][img2_j]==1){
                    count++;
                }
            }
            
        }
        return count;
    }
}