import java.util.Arrays;

class MergeAndSortInSameArray {
        public static void main(String[] args) {
                int[] array1 = { 1, 3, 5, 0, 0, 0 };
                int[] array2 = { 2, 4, 6 };

                int m = 3;
                int n = 3;

                mergeAndSort(array1, array2, m, n);

                System.out.println("Merged and sorted array1: " + Arrays.toString(array1));
        }

        public static void mergeAndSort(int[] array1, int[] array2, int m, int n) {
                int i = m - 1;
                int j = n - 1;
                int k = m + n - 1;

                while (i >= 0 && j >= 0) {
                        if (array1[i] > array2[j]) {
                                array1[k--] = array1[i--];
                        } else {
                                array1[k--] = array2[j--];
                        }
                }

                while (j >= 0) {
                        array1[k--] = array2[j--];
                }
        }
}
