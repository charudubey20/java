/* Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k. */

public class RemoveElement {
    public static void main(String[] args) {
        // Example input arrays
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;

        // Call the function to remove the value
        int k = removeElement(nums, val);

        // Print the result
        System.out.println("k = " + k);
        System.out.print("Modified Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the next position where we will place a number that is not equal
                   // to val

        // Iterate over the entire array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move the current element to the "k" position
                k++; // Increment "k" to the next available position
            }
        }

        // Return the number of elements that are not equal to val
        return k;
    }
}
