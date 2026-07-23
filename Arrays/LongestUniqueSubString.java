// Two pointer approach on the same side.

import java.util.HashSet;

public class LongestUniqueSubString {

    public static int LongestSubString(String str) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int n = str.length();
        for (int right = 0; right < n; right++) {
            if (set.contains(str.charAt(right))) {
                while (set.contains(str.charAt(right))) {
                    set.remove(str.charAt(left));
                    left++;
                }
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(LongestSubString(str));
    }
}