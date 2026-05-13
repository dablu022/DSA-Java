class Solution {
    public int maxProductDifference(int[] nums) {
       int n =nums.length;
       int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i] > max){
                max2=max;
                max=nums[i];
            }else if(nums[i]>max2){
                max2=nums[i];
            }
        }
       int prd1= max*max2;
       
        for(int i=0;i<n;i++){
            if(nums[i] < min){
                min2=min;
                min=nums[i];
            }else if(nums[i]<min2){
                min2=nums[i];
            }
        } 
        int prd2 = min*min2;

        return prd1-prd2;
    }
}