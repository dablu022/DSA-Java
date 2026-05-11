import java.util.*;

class Solution {

    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();

        // har number pe loop
        for(int num : nums) {

            // digits string me convert kiye
            String s = String.valueOf(num);

            // har character ko digit bana ke add kar diya
            for(char ch : s.toCharArray()) {

                ans.add(ch - '0');
            }
        }

        // ArrayList -> int[]
        int[] result = new int[ans.size()];

        for(int i = 0; i < ans.size(); i++) {

            result[i] = ans.get(i);
        }

        return result;
    }
}