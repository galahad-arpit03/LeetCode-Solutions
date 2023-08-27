import java.util.*;

public class longestPalinderominc_Substring {
        public static void main(String[] args) {
                String s1 = new String("babad");
                char[] a1 = s1.toCharArray();
                int b = 0;
                for (int i = 0; i < a1.length; i++) {
                        for (int j = 0; j < a1.length; j++) {
                                if (a1[b] == a1[j]) {

                                }
                        }
                        b++;
                }
        }
}

public class Solution {
        private int lo, maxLen;

        public String longestPalindrome(String s) {
                int len = s.length();
                if (len < 2)
                        return s;

                for (int i = 0; i < len - 1; i++) {
                        extendPalindrome(s, i, i); // assume odd length, try to extend Palindrome as possible
                        extendPalindrome(s, i, i + 1); // assume even length.
                }
                return s.substring(lo, lo + maxLen);
        }

        private void extendPalindrome(String s, int j, int k) {
                while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
                        j--;
                        k++;
                }
                if (maxLen < k - j - 1) {
                        lo = j + 1;
                        maxLen = k - j - 1;
                }
        }
}