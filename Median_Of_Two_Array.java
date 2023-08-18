// import java.util.*;

// class Median_Of_Two_Array {
//         public static void main(String[] args) {

//                 int arr[] = { 1, 2 };
//                 int arr1[] = { 3, 4 };

//                 StringBuilder merged = new StringBuilder();
//                 int i =0;
//                 while(i<){

//                 }
//                 String mA = merged.toString();

//                 // System.out.println(charArray);

//                 if (charArray.length % 2 == 1) {
//                         System.out.println(charArray[charArray.length / 2]);
//                 } else if (charArray.length % 2 == 0) {
//                         int a = charArray.length / 2;
//                         double b = (charArray[a] + charArray[a - 1]) / charArray.length;
//                         System.out.println(b);
//                 }

//         }
// }

import java.util.Arrays;

class Median_Of_Two_Array {
        public static void main(String[] args) {
                int[] array1 = { 1, 2 };
                int[] array2 = { 3, 4 };

                int[] mergedArray = mergeArrays(array1, array2);

                System.out.println("Merged array: " + Arrays.toString(mergedArray));
        }

        public static int[] mergeArrays(int[] array1, int[] array2) {
                int length1 = array1.length;
                int length2 = array2.length;

                int[] mergedArray = new int[length1 + length2];

                System.arraycopy(array1, 0, mergedArray, 0, length1);
                System.arraycopy(array2, 0, mergedArray, length1, length2);
                Arrays.sort(mergedArray);
                if (mergedArray.length % 2 == 1) {
                        double c = mergedArray[mergedArray.length / 2];
                        System.out.println(c);
                } else if (mergedArray.length % 2 == 0) {
                        int a = mergedArray.length / 2;
                        double b = (mergedArray[a] + mergedArray[a - 1]) / 2.0;
                        System.out.println(b);
                }

                return mergedArray;
        }
}
