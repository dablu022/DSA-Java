class Solution {
    public boolean isGood(int[] nums) {
        int max =0;
        int n= nums.length;
        for( int num : nums){
            max = Math.max(max, num);
        }
        if(n != max + 1) return false;
        int freq[] = new int[max + 1];
        for( int i : nums){
            freq[i]++;
        }

        for(int i=1;i<max;i++){
            if(freq[i] !=1) return false;
        }
        if(freq[max] !=2) return false;
        else return true;

      

    }
}