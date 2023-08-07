//3rd code 

class Solution {
        public int searchInsert(int[] nums, int target) {
                int left = 0;
                int right = nums.length - 1;

                while (left <= right) {
                        int mid = left + (right - left) / 2;

                        if (nums[mid] == target) {
                                return mid;
                        } else if (nums[mid] < target) {
                                left = mid + 1;
                        } else {
                                right = mid - 1;
                        }
                }

                return left;
        }
}

// 1st code

// import java.util.*;

// public class SearchInsertPosition {
// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// System.out.println("Enter the size of array ");
// int str1 = scn.nextInt();
// System.out.println("Enter the target value");
// int target = scn.nextInt();

// System.out.println("Enter the values");
// int arr[] = new int[str1];
// for (int i = 0; i < str1; i++) {
// arr[i] = scn.nextInt();
// }

// for (int i = 0; i < arr.length; i++) {
// if (target == arr[i]) {
// System.out.println(arr[i]);
// }
// if (target != arr[i]) {
// int[] newArray = Arrays.copyOf(arr, arr.length + 1);
// newArray[newArray.length - 1] = target;
// Arrays.sort(newArray);
// for (int j = 0; j < newArray.length; j++) {
// if (newArray[j] == target) {
// System.out.println(newArray[j]);
// } else {
// continue;
// }
// }

// }
// }
// }
// }

// 2nd code

// import java.util.*;

// public class SearchInsertPosition {
// public static void main(String[] args) {
// Scanner scn = new Scanner(System.in);
// System.out.println("Enter the size of array ");
// int str1 = scn.nextInt();
// System.out.println("Enter the target value");
// int target = scn.nextInt();

// System.out.println("Enter the values");
// int arr[] = new int[str1];
// for (int i = 0; i < str1; i++) {
// arr[i] = scn.nextInt();
// }

// boolean found = false;

// for (int i = 0; i < arr.length; i++) {
// if (target == arr[i]) {
// System.out.println(i);
// found = true;
// break;
// }
// }

// if (!found) {
// int[] newArray = Arrays.copyOf(arr, arr.length + 1);
// newArray[newArray.length - 1] = target;
// Arrays.sort(newArray);

// int index = Arrays.binarySearch(newArray, target);
// if (index >= 0) {
// System.out.println(index);
// }
// }
// }
// }
