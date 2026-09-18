class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max=nums[0];
        int min =nums[0];
        int mid=nums[0];
        if(nums.length<=2) return -1;
        for(int i=0;i<nums.length;i++){

        if(nums[i]>max) max=nums[i];
        if(nums[i]<min) min=nums[i];

        if(nums[i]>min && nums[i]<max) mid= nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>min && nums[i]<max) mid= nums[i]; 
        }
        return mid;
        
    }
}