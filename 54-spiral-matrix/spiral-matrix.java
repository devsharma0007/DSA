class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int fc  = 0;
        int fr = 0;
        int lc = arr[0].length-1;
        int lr = arr.length-1;
        ArrayList<Integer> ans = new ArrayList<>();

        while(fr<=lr && fc<=lc){
            for(int i = fc;i<=lc;i++){
                ans.add(arr[fr][i]);
            }
            fr++;

            for(int i = fr;i<=lr;i++){
                ans.add(arr[i][lc]);
            }
            lc--;

            if(fr<=lr){
                for(int i = lc;i>=fc;i--){
                    ans.add(arr[lr][i]);
                }
                lr--;
            }

            if(fc<=lc){
                for(int i = lr;i>=fr;i--){
                    ans.add(arr[i][fc]);
                }
                fc++;
            }
        }

        return ans;
    }
}