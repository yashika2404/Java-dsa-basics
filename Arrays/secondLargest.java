public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20};
        int res = secondLargest(arr);
        System.out.println("Second largest: " + res);
    }

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}
