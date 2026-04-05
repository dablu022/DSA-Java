class Solution {
    public int mySqrt(int n) {
       long str = 0, end = n, root = 1;
      // if(n==0 || n==1) return n; 
       while (str <= end) {
         long mid = (end + str) / 2;
           

           if (mid*mid == n) return (int)mid;
           else if (mid*mid >n) {   
                end =mid-1;
                        
           } else {
                str=mid+1;             
           }
       }
       
       return (int)end;  
    }
}