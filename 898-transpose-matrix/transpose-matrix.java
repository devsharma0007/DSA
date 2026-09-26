class Solution {
    public int[][] transpose(int[][] mat) {
        
        int columns = mat.length;
        int rows = mat[0].length;

        int[][] bat = new int[rows][columns];

        for(int i = 0;i<bat.length;i++){
            for(int j = 0;j<bat[0].length;j++){
                bat[i][j] = mat[j][i];
            }
        }
        return bat;
    }
}