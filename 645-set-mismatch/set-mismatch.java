class Solution {
    public void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int[] findErrorNums(int[] nums) {
       int ans[] = new int [2];
       int n =nums.length;
       int i=0;
       while(i<n){
        int rightidx=nums[i] -1;
            if(nums[i] == i+1 || nums[rightidx] == nums[i]) i++;
            else swap(nums,i,rightidx);
       }
       for(int j=0;j<n;j++){
        if(nums[j]!= 1+j) {
            ans[0]=nums[j];
            ans[1]=j+1;;
        }
        
       } 
       return ans;
    }
}