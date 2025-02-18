import java.util.Arrays;

public class RemoveOdds {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evens = removeOdds(nums);
        System.out.println(Arrays.toString(evens));
    }

    public static int[] removeOdds(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        int[] evensNum = new int[count];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evensNum[j] = nums[i];
                j++;
            }
        }
        return evensNum;
    }
}
