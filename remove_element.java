import java.util.*;

public class remove_element {
        public int removeElement(int[] nums, int val) {
                if (nums.length == 0) {
                        return 0;
                }
                int i = 0;
                for (int j = 0; j < nums.length; j++) {
                        if (nums[j] == val)
                                continue;

                        System.out.println(nums[j]);

                }
                return 0;
        }

        public static void main(String args[]) {
                Scanner scn = new Scanner(System.in);
                int str1 = scn.nextInt();
                int arr[] = new int[str1];
                for (int i = 0; i <= str1; i++) {
                        arr[i] = scn.nextInt();
                }

                int val = 5;
                                
        }
}