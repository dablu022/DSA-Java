class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
       int str=1,end=x;
       while(str<=end){
        int mid= str +(end-str)/2;
        if(mid==x/mid) return mid;
        else if(mid > x/mid) end= mid-1;
        else{
            str=mid+1;
        }
       } 
       return end;
    }
}