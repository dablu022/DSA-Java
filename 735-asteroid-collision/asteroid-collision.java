class Solution {
    public int[] asteroidCollision(int[] as) {
        Stack<Integer> st = new Stack();
        int n= as.length;
    
        for(int i=0;i<n;i++){
             if(st.size()!=0 && as[i]>0) st.push(as[i]);
            else  while(st.size()!=0 && st.peek()<Math.abs(as[i]) && st.peek()>0 && as[i]<0) st.pop();
             if (st.size()!=0 && st.peek()==Math.abs(as[i]) && as[i]<0) st.pop();
            else if (st.size()==0 || st.peek()<0 ) st.push(as[i]); 
           
        }
        int s = st.size();
        int ans []= new int[s];
         Stack<Integer> st1 = new Stack();
        for(int i=0;i<s;i++) st1.push(st.pop());
        for(int i=0;i<s;i++) ans[i]=st1.pop();
           

        return ans;
    }
}