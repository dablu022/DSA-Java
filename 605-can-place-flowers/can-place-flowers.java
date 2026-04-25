class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {

        int cnt = 0;

        for(int i = 0; i < f.length; i++){
            int left = (i == 0) ? 0 : f[i-1];
            int right = (i == f.length - 1) ? 0 : f[i+1];
            if(f[i] == 0 && left == 0 && right == 0){
                f[i] = 1;   
                cnt++;
            }
        }

        return cnt >= n;
    }
}