class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] s1 = s.split(" ");
        if (pattern.length() != s1.length) return false;

        String[] map = new String[256]; // char → word

        for (int i = 0; i < pattern.length(); i++) {
            char c1 = pattern.charAt(i);
            String c2 = s1[i];
            if (map[c1] != null) {
                if (!map[c1].equals(c2)) return false;
            } 
          
            else {

                for (int j = 0; j < 256; j++) {
                    if (c2.equals(map[j])) return false;
                }
                map[c1] = c2;
            }
        }
        return true;
    }
}