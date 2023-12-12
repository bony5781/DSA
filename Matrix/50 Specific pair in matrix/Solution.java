class Solution {
    public static int findMaxValue(int n, int[][] mat) {
        // code here
        int maxMat[][] = new int[n][n];
        maxMat[n-1][n-1] = mat[n-1][n-1];
        
        for(int j = n - 2; j >= 0; j--){
            maxMat[n-1][j] = Math.max(maxMat[n-1][j+1], mat[n-1][j]);
        }
        
        for(int i = n - 2; i >= 0; i--){
            maxMat[i][n-1] = Math.max(maxMat[i+1][n-1], mat[i][n-1]);
        }
         
        for(int i = n - 2; i >= 0; i--){
             for(int j = n - 2; j >= 0; j--){
                maxMat[i][j] = Math.max(maxMat[i+1][j], Math.max(maxMat[i][j+1], mat[i][j]));
            }
        }
        
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1; j++){
                ans = Math.max(ans, maxMat[i+1][j+1] - mat[i][j]);
            }
        }
        
        return ans;
    }
}
        
