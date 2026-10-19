class Solution {
    public int getmax(int[] heights) {
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
            while(st.size()>0 && heights[st.peek()] >= heights[i]) st.pop();
            if(st.size()==0) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }

        int max = 0;
        for(int i=0;i<n;i++){
            int area = heights[i]*(nse[i]-pse[i]-1);
            max= Math.max(max,area);
        }
        return max;
    }
    public int maximalRectangle(char[][] arr) {
        int m=arr.length,n=arr[0].length;

int[][] mat = new int[m][n];
for(int i = 0; i < m; i++) {
    for(int j = 0; j < n; j++) {
        mat[i][j] = arr[i][j] - '0';
    }
}

        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1) mat[i][j]+=mat[i-1][j];
            }
        }

        int max =0;
        for(int [] row : mat){
            int area=getmax(row);
            max = Math.max(max,area);
        }
        return max;
    }
}