class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length ,m=n/2;
        if(n==1) return nums[0];
        int cnt=0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[(i+1)]) cnt++;
           int ans=nums[i];
            if(cnt==m) return ans;
        }
        return -1;
    }
}