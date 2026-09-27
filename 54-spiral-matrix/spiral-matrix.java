class Solution {
    public List<Integer> spiralOrder(int[][] arr) {

        int fr = 0;
        int fc = 0;
        int lr = arr.length - 1;
        int lc = arr[0].length - 1;

        ArrayList<Integer> ans = new ArrayList<>();

        while (fr <= lr && fc <= lc) {

            // 1. Top row → left to right
            for (int i = fc; i <= lc; i++) {
                ans.add(arr[fr][i]);
            }
            fr++;

            // 2. Right column → top to bottom
            for (int i = fr; i <= lr; i++) {
                ans.add(arr[i][lc]);
            }
            lc--;

            // 3. Bottom row → right to left
            if (fr <= lr) {
                for (int i = lc; i >= fc; i--) {
                    ans.add(arr[lr][i]);
                }
                lr--;
            }

            // 4. Left column → bottom to top
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    ans.add(arr[i][fc]);
                }
                fc++;
            }
        }

        return ans;
    }
}