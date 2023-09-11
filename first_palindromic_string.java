class Solution {
        public String firstPalindrome(String[] words) {

                for (int i = 0; i < words.length; i++) {
                        String str = words[i];
                        boolean x = palindrome(str);
                        if (x) {
                                return words[i];
                        }
                }
                return "";
        }

        public boolean palindrome(String a) {
                String b = "";
                for (int i = a.length() - 1; i >= 0; i--) {
                        b = b + a.charAt(i);
                }
                return b.equals(a);
        }
}