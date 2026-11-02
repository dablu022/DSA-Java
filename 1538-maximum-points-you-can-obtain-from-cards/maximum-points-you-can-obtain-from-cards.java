class Solution {
    public int maxScore(int[] cp, int k) {
        int n = cp.length;
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++){
            sum+=cp[i];
        }
        max=sum;
        for(int i=1;i<=k;i++){
            sum-=cp[k-i];
            sum+=cp[n-i];
            max=Math.max(sum,max);
        }
        return max;
    }
}