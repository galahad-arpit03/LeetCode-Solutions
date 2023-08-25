import java.util.*;

public class Concatination_of_Array {
        public static void main(String[] args) {
                int[] result = new int[nums.length * 2];
                System.arraycopy(nums, 0, result, 0, nums.length);
                System.arraycopy(nums, 0, result, nums.length, nums.length);

                return result;
        }

}
