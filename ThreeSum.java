import java.util.*;

class ThreeSum {
        public static void main(String[] args) {

                int arr[] = { 0, 0, 0, 0 };
                Arrays.sort(arr);
                List<List<Integer>> result = new ArrayList<>();

                for (int i = 0; i < arr.length - 2; i++) {
                        if (i > 0 && arr[i] == arr[i - 1]) {
                                continue; // Skip duplicates
                        }

                        int j = i + 1;
                        int k = arr.length - 1;

                        while (j < k) {
                                int sum = arr[i] + arr[j] + arr[k];
                                if (sum == 0) {
                                        result.add(Arrays.asList(arr[i], arr[j], arr[k]));

                                        while (j < k && arr[j] == arr[j + 1]) {
                                                j++; // Skip duplicates
                                        }
                                        while (j < k && arr[k] == arr[k - 1]) {
                                                k--; // Skip duplicates
                                        }

                                        j++;
                                        k--;
                                } else if (sum < 0) {
                                        j++;
                                } else {
                                        k--;
                                }
                        }
                }

                for (List<Integer> result1 : result) {
                        for (int value : result1) {
                                System.out.print(value + " ");
                        }
                        System.out.println();
                }
        }
}
