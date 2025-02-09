import java.util.Arrays;

public class SortingAlgos {
    public static void main(String[] args) {
        int[] nums = {5, 3, 6, 9, 1, 7, 8, 2, 4};
        selectionSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static int[] selectionSort(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i];
            ;
        }

        for (int i = 0; i < newArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            int tempI = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = tempI;
//        }
        }
        return newArray;
    }
}
