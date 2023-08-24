
// class Solution {
//         public int lengthOfLongestSubstring(String s) {
//                 Map<Character, Integer> map = new HashMap<>();
//                 int i = 0;
//                 int j = 0;
//                 int max = 0;
//                 while (j < s.length()) {
//                         map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
//                         if (map.size() == j - i + 1) {
//                                 max = Math.max(max, j - i + 1);
//                                 j++;
//                         } else if (map.size() < j - i + 1) {
//                                 while (map.size() < j - i + 1) {
//                                         map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
//                                         if (map.get(s.charAt(i)) == 0)
//                                                 map.remove(s.charAt(i));
//                                         i++;
//                                 }
//                                 j++;
//                         }
//                 }
//                 return max;
//         }
// }
import java.util.*;

public class Longest_Substring_Without_Repeating {
        public static void main(String[] args) {
                // Your code here
                Set<Character> seen = new HashSet<>();
                int left = 0;
                int right = 0;
                int max = 0;
                while (right < s.length) {
                        char c = s.charAt(right);
                        if (seen.add(c)) {
                                max = Math.max(max, right + left - 1);
                                right++;
                        }

                        else {
                                while (s.charAt(left) = c) {
                                        seen.remove(s.charAt(left));
                                        left++;
                                }
                                seen.remove(c);
                                left++;
                        }
                }
                returm max;
        }
}