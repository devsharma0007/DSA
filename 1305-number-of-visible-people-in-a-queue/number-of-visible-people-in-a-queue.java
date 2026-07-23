class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        int[] cnt  =  new int[n];
        cnt[n-1] = 0;
        
        for(int i = n-2;i>=0;i--){
            int count  = 0;
            while(st.size()>0 && arr[i]>st.peek()){
                st.pop();
                count++;
            }
            if(st.size()==0) st.push(arr[i]);
            if(arr[i]<st.peek()){
                st.push(arr[i]);
                count++;
            }
            cnt[i] = count;
        }
        return cnt;
    }
}