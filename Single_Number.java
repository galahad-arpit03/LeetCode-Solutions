
public class Single_Number {
        public static void main(String[] args) {
                int arr[] = { 2, 2, 3, 1, 3, 4, 4 };
                int count = 0;
                for (int i : arr) {
                        count ^= i;
                }
                System.out.println(count);
        }
}
