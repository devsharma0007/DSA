class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        Stack<Integer> pt = new Stack<>();
        int [] nse = new int[n];
        int [] pse = new int[n];
        for(int i = n-1;i>=0;i--){
            while(st.size()>0 && arr[st.peek()]>=arr[i]) st.pop();
            if(st.size()==0){
                nse[i] = n;
                st.push(i);
                } 
            if(arr[i]>arr[st.peek()]){
                nse[i] = st.peek();
                st.push(i);
            }
        }
        for(int i = 0;i<=n-1;i++){
            while(pt.size()>0 && arr[pt.peek()]>=arr[i]) pt.pop();
            if(pt.size()==0){
                pse[i] = -1;
                pt.push(i);
            
            }
            if(arr[i]>arr[pt.peek()]){
                pse[i] = pt.peek();
                pt.push(i);
            }
            }
            int maxarea = Integer.MIN_VALUE;
            for(int i = 0;i<n;i++){
                int area = arr[i]*(nse[i]-pse[i]-1);
                if(area>maxarea){
                    maxarea = area;
                }

            }
            return maxarea;
    }
}