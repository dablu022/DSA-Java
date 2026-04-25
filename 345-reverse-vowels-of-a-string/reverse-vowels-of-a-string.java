class Solution {
    public String reverseVowels(String s) {
          char[] arr=s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
           if(!isVowel(arr[i])) i++;
            else if(!isVowel(arr[j])) j--;
            else{
                char temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        String ans= new String(arr);
        return ans;
        }
        boolean isVowel(char c){
    return "AEIOUaeiou".indexOf(c) != -1;
}

    }
