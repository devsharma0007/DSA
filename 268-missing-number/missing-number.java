class Solution {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = (n*(n+1))/2;
        int add = 0;
        for(int i = 0;i<n;i++){
            add += arr[i];
        }
        sum = sum-add;
        return sum;
        
    }
}