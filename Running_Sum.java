import java.util.*;

public class Running_Sum {
        public static void main(String[] args) {
                int arr[] = { 1, 2, 3, 4 };
                int arr1[] = new int[arr.length];
                arr1[0] = arr[0];
                for (int i = 1; i < arr.length; i++) {
                        arr1[i] = arr1[i - 1] + arr[i];

                }
                int i = 0;
                while (i < arr.length) {
                        System.out.println(arr1[i]);
                        i++;
                }
        }
}