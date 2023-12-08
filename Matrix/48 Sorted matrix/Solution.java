class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                ans.add(Mat[i][j]);
            }
        }
        Collections.sort(ans);
        
        int k = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                Mat[i][j] = ans.get(k++);
            }
        }
        
        return Mat;
    }
};