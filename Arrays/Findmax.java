public class FindMax {
    public static void main(String[] args) {
        int[] arr = {3, 9, 2, 15, 6};

        int max = findMaximum(arr);
        System.out.println("Maximum value in the array is: " + max);
    }

    public static int findMaximum(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
