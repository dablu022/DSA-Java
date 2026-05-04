class Solution {
    public boolean isIsomorphic(String s, String t) {
       if(s.length()!= t.length()) return false;
         int[] ms= new int[256];
         int[] mt= new int[256];

       for(int i=0;i< s.length();i++){
        char c1=s.charAt(i);
        char c2=t.charAt(i);
        if(ms[c1]==0 && mt[c2]==0){
            ms[c1] = c2;
            mt[c2] = c1;

           


        }else{
            if(ms[c1]  != c2  ) return false;
        }


       }
       return true;
    }
}