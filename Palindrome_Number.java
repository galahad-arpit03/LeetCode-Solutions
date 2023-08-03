public class Palindrome_Number {
        public boolean isPalindrome(int x) {
                int rev = 0;
                int m = x;
                while (x > 0) {
                        int r = x % 10;
                        rev = rev * 10 + r;
                        x = x / 10;
                }
                if (rev == m) {
                        return true;
                } else {
                        return false;
                }
        }
}
