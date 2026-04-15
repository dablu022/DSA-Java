class Solution {
    public int findKthPositive(int[] nums, int k) {
        int lo=0,hi=nums.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int correctno=mid+1;
            int missing=nums[mid]-correctno;
            if(missing>=k) hi=mid-1;
            else lo=mid+1;
        }  
        return hi+1+k;
        
          }
}