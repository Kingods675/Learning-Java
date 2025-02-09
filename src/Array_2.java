public class Array_2 {
    public static void main(String[] args) {
//        int a = 1;
//        int b = 9;
//        int c = a;
//
//        a = b;
//        b = c;
//
//
//        System.out.println(a);
//        System.out.println(b);

        int[] nums = {5, 3, 6, 9, 1} ;

        int maxNum = findMax(nums);
        System.out.println(maxNum);
        int minNum = findMin(nums);
    }

    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if ( max < nums[i])
                max = nums[i];
        }
        return max;
    }

    public static int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if ( min > nums[i])
                min = nums[i];
        }
        return min;
    }

}
