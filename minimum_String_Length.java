
import java.util.*;

class minimum_String_Length {
        public static void main(String[] args) {
                StringBuilder sb = new StringBuilder("aabbcc");
                String emp = sb.toString();
                char[] charArray = emp.toCharArray();
                Arrays.sort(charArray);
                sb = new StringBuilder(new String(charArray));
                int i = 0;
                int j = 0;
                StringBuilder sb1 = new StringBuilder();
                while (sb.length() > i) {
                        if (sb1.length() == 0 || sb.charAt(i) != sb1.charAt(sb1.length() - 1)) {
                                sb1.append(sb.charAt(i));
                        }
                        i++;
                }
                String s = new String(sb1);
                int b = s.length();
                System.out.println(b);
        }
}
