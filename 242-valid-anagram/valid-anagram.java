class Solution {
    public boolean isAnagram(String s, String t) {
        int s1=s.length(),t1=t.length();
        if(s1!=t1) return false;
        char [] arr1=s.toCharArray();
         char [] arr2=t.toCharArray();
         Arrays.sort(arr1);
         Arrays.sort(arr2);
        String ss = new String(arr1);
         String tt = new String(arr2);
          if(ss.equals(tt)) return true;
          else return false;
    }
}