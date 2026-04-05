class Solution {
    public int searchInsert(int[] nums, int target) {
        int str=0,end=nums.length-1, idx=-1;
        while(str<=end) {
            int mid= str +(end-str)/2;
            if(nums[mid]<target){
               
                str=mid+1;
            }else{
                end= mid-1;
            }
        }
        return str;
    }
}