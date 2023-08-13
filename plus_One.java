
import java.util.*;

class plus_One {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int sum = 0;
                int n = sc.nextInt();
                int[] arr = new int[n];
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = sc.nextInt();

                }
                for (int i = arr.length - 1; i >= 0; i--) {
                        if (arr[i] < 9) {
                                arr[i]++;
                                break;
                        } else {
                                arr[i] = 0;

                        }
                }
                if (arr[0] == 0) {
                        arr = new int[arr.length + 1];
                        arr[0] = 1;
                }

                for (int j = 0; j < arr.length; j++) {
                        System.out.print(arr[j] + " ");
                }

        }
}
