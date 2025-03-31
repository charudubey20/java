public class MaxProduct {
    public static void main(String[] args) {
        // Example input
        int[] nums = { 1, 5, 3, 7, 2 };

        // Call the maxProduct function to get the result
        int result = maxProduct(nums);

        // Output the result
        System.out.println("Maximum Product: " + result);
    }

    public static int maxProduct(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int max1 = nums[0];
        int max2 = nums[1];

        if (max2 > max1) {
            max1 = max2;
            max2 = nums[0];
        }
        for (int i = 2; i < nums.length; i++) {
            int num = nums[i];
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

        }
        return max1 * max2;
    }
}