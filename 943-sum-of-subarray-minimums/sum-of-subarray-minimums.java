class Solution {
    public int sumSubarrayMins(int[] heights) {
       int n=heights.length;
        int[] pse = new int[n];
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        nse[n-1] =n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && heights[st.peek()] >= heights[i]) st.pop();
            if(st.size()==0) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }

        while(st.size()>0) st.pop();

        pse[0] =-1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && heights[st.peek()] > heights[i]) st.pop();
            if(st.size()==0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
         long ans = 0;
       int mod = (int)Math.pow(10, 9) + 7;

        for(int i=0; i<n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;

            ans = (ans + (long)heights[i] * left % mod * right % mod) % mod;
        }

        return (int) ans;
    }
}