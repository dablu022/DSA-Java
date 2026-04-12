class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k = k % n;
        int d= n-k;
        int i=0,j=n-1;

        swap(nums,i,d-1);
        swap(nums,d,j);
         swap(nums,i,j);

    }
    public void swap(int[] nums,int i,int j){
        while(i<j){
              int temp=nums[i]; 
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}