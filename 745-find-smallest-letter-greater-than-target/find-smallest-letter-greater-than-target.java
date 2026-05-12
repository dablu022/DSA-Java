class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int n = letters.length;

        int i = 0;
        int j = n - 1;

        while(i <= j){

            int mid = i + (j - i) / 2;

            // current char target se chhota ya equal hai
            // to right me jao
            if(letters[mid] <= target){
                i = mid + 1;
            }

            // warna left me check karo
            else{
                j = mid - 1;
            }
        }

        // wrap around handle karega
        return letters[i % n];
    }
}