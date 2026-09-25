class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return help(nums,  target ,0,n-1) ;
    }
    public int help(int[] nums,int target,int lo,int hi){
        if(lo > hi) return -1;
        int mid= lo + (hi -lo)/2;
        if(nums[mid]== target) return mid ;
        else if(nums[mid] > target ) return  help(nums, target, lo,mid -1) ;
        else return  help(nums, target, mid + 1,hi) ;
    }
}