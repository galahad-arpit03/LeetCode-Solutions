import java.util.*;

public class Longest_Substring_Without_Repeating {
        public static void main(String[] args) {
                String s = "abcabcbb";
                // String arr[]=s;
                String s1 = new String();
                for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == s1.charAt(i)) {
                                // s1 += s;
                                System.out.println(s1.charAt(i));
                        }
                        // s1 += s;
                }
        }
}
