class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0,n=nums.length;
        while(i<n){
        if(nums[i]<=0 || nums[i]>n || nums[i] == nums[nums[i] -1] || nums[i]== i+11) i++;
        else swap(nums,i,nums[i]-1);
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j+1) return j+1;
        }
        return n+1;
    }
    public void swap(int nums[] ,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}