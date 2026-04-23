class Solution {
    public String mergeAlternately(String word1, String word2) {
        String em="";
        int n1=word1.length(),n2=word2.length();
        for(int i=0;(i<n2 || i<n1);i++){
             if(i < n1) em += word1.charAt(i);
            if(i < n2) em += word2.charAt(i);
        }
        return em;
        
    }
}