class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0;i<n;i++){
            int stcol = 0;
            int endcol = n-1;
            while(stcol<endcol){
                int temp = matrix[i][stcol];
                matrix[i][stcol] = matrix[i][endcol];
                matrix[i][endcol] = temp;
                stcol++;
                endcol--;
            }
        }
        
        
    }
}