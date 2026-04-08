class Solution {
    public int singleNonDuplicate(int[] nums) {
     int n= nums.length,lo=0,hi=n-1;
     if(n==1) return nums[0];
     if(nums[0]!=nums[1]) return nums[0];
     if(nums[n-1]!=nums[n-2]) return nums[n-1];

     while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        if(nums[mid-1]!=nums[mid] && nums[mid]!=nums[mid+1]) return nums[mid];
        int f=mid,l=mid;
        if(nums[mid]==nums[mid-1]) f=mid-1;
        else l=mid+1;
        if((f-lo)%2==0) lo=l+1;
        else hi=f-1;

     }
     return -1;

    }
}