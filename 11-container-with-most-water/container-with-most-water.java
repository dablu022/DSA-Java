class Solution {
    public int maxArea(int[] height) {
     
      int n= height.length;
       int mx=0 , i=0 ,j=n-1;
      while(i < j){
        int wid = j-i;
        int ht = Math.min(height[i],height[j]);
        int area= wid* ht;
        mx =Math.max(mx , area);
        if(height[i] < height[j]) i++;
        else j--;
      }
      return mx;
    }
}