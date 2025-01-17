import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
//            nums[i] = (int) (Math.random() * (100 - 1) + 1);
            nums[i] = i + 1;
        }
        System.out.println(Arrays.toString(nums));
//        System.out.println(linearSearch(nums, 20));
        System.out.println(binarySearch(nums, 6));
    }

    public static int linearSearch(int[] arr, int searchValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int searchValue) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;

        while ( leftPointer < rightPointer) {
            int midPointer = (leftPointer + rightPointer) / 2;
            int midValue = arr[midPointer];
            if (searchValue < midValue) {
                rightPointer = midPointer - 1;
            } else if (searchValue > midValue) {
                leftPointer = midPointer + 1;
            } else { return midPointer;
            }
        }
        return -1;
    }

}
