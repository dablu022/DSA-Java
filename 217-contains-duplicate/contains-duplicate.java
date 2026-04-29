class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,j=0;
        if(n==1) return false;
        for(int i=j+1;i<n;i++){
            if(nums[i]==nums[j]) return true;
            j++;
        }
        return false;
    }
}