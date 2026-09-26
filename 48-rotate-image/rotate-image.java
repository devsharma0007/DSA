class Solution {
    public void rotate(int[][] a) {

        int n = a.length;

        // Step 1: Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int stcol = 0;
            int endcol = n - 1;

            while (stcol < endcol) {
                int temp = a[i][stcol];
                a[i][stcol] = a[i][endcol];
                a[i][endcol] = temp;

                stcol++;
                endcol--;
            }
        }
    }
}