public class LinearSearchUsingRecursion {

    /**
     * Recursively searches for a key in an array using linear search.
     *
     * @param nums The array to search through
     * @param key The value to find in the array
     * @param index The current index being examined (start with 0)
     * @return The index of the key if found, -1 if not found
     *
     * Time Complexity: O(n) - In worst case, examines every element
     * Space Complexity: O(n) - Due to recursion stack (n recursive calls in worst case)
     */
    private static int searchRecur(int[] nums, int key, int index) {
        // Base case: reached end of array without finding the key
        if (index == nums.length) {
            return -1;
        }

        // Base case: found the key at current index
        if (nums[index] == key) {
            return index;
        }

        // Recursive case: search in the remaining portion of the array
        return searchRecur(nums, key, index + 1);
    }

    /**
     * Public interface for recursive linear search.
     *
     * @param nums The array to search through
     * @param key The value to find in the array
     * @return The index of the key if found, -1 if not found
     */
    public static int search(int[] nums, int key) {
        return searchRecur(nums, key, 0);
    }
}