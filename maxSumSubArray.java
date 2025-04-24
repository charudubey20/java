public class maxSumSubArray {
    public static int findMaxSum(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            return -1;
        }

        int maxSum = 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;
        int result = findMaxSum(arr, k);
        System.out.println("Max Sum of subarray of size " + k + " is: " + result);
    }
}
