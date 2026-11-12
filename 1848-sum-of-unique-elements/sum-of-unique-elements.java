class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        int sum=0;
        int freq[]=new int[101];

        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
          for(int i=0;i<n;i++){
            if(freq[nums[i]]==1) sum+=nums[i];
          }
        return sum;
    }
}