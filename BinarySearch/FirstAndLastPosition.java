public class FirstAndLastPosition {

    public static int[] searchRange(int[] nums, int target) {
        int first = findIndex(nums, target, true);
        int last = findIndex(nums, target, false);
        return new int[]{first, last};
    }

    private static int findIndex(int[] nums, int target, boolean findFirst) {
        int index = -1, start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (findFirst) end = mid - 1;
                else start = mid + 1;
            } else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] res = searchRange(nums, 8);
        System.out.println("First and Last Position: " + res[0] + ", " + res[1]);
    }
}
