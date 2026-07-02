class Solution {
    public int[][] transpose(int[][] a) {
        int row = a.length;
        int column = a[0].length;
        int[][] b = new int[column][row];
        for(int i = 0;i<b.length;i++){
            for(int j = 0;j<b[0].length;j++){
                b[i][j] = a[j][i];
            }
        }
        return b;
    }
}