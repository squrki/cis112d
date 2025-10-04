import java.util.Arrays;

public class HW4_1 {
    public static void main(String[] args) {
        // your solution will be tested as such, sequentially with random input
        Solution sol = new Solution();
        System.out.println(sol.canDistribute(new int[] { 3, 4, 5, 6 }, 2)); // true
        System.out.println(sol.canDistribute(new int[] { 1 }, 1)); // true
        System.out.println(sol.canDistribute(new int[] { 1, 3, 2, 3, 4, 1, 3, 5, 2, 1 }, 5)); // true
        System.out.println(sol.canDistribute(new int[] { 5, 4, 3, 2, 2 }, 2)); // true
        System.out.println(sol.canDistribute(new int[] { 4, 5, 6, 5 }, 2)); // true
        System.out.println(sol.canDistribute(new int[] { 1 }, 2)); // false
        System.out.println(sol.canDistribute(new int[] { 1, 2, 2, 3, 3, 5, 5 }, 12)); // false
        System.out.println(sol.canDistribute(new int[] { 4, 3, 2, 3, 5, 2, 1 }, 3)); // false
        // etc.
    }
}

/**
 * PURPOSE: Proportion and distribute resources equally to 'k' medical
 * facilities
 * PARAMETERS: resources - positive integer array, groups - 'k' number of
 * facilities
 * RETURN VALUES: boolean on if the distribution is possible.
 */
class Solution {
    public boolean canDistribute(int[] resources, int groups) {
        // Check for all boundary conditions to return result immediately if known,
        // e.g., resources.length() = 1 and k = 1, return true, resources.length() = 1
        // and k = 4, return false, etc.
        if (resources.length == 1) {
            if (groups == 1)
                return true;
            else
                return false;
        }

        // Find the purported allocation for each group, i.e., allocation =
        // SUM(resources)/k.
        int allocation = Arrays.stream(resources).sum();

        // check if resources can be evenly divided
        if (allocation % groups != 0) {
            return false;
        } else {
            allocation = allocation / groups;
        }

        // Sort the resources in either ascending or descending order.
        Arrays.sort(resources);
        // sort descending order
        for (int i = 0; i < resources.length / 2; i++) {
            int temp = resources[i];
            resources[i] = resources[resources.length - 1 - i];
            resources[resources.length - 1 - i] = temp;
        }

        // Check if the selected resource is <= allocation:
        if (resources[0] > allocation)
            return false;

        // Create an empty array of integers with k elements.
        int[] buffer = new int[groups];

        // Pick the highest resource value in your resources.
        int resIndex = 0;

        return checkDivs(resources, buffer, resIndex, allocation);

    }

    // Create another solution method of your choice to enable recursion.

    /**
     * PURPOSE: Recursing helper function for canDistribute()
     * PARAMETERS:
     * int[] res - resources
     * int[] buf - memory buffer of allocations
     * int resInd - current index of res
     * int alloc - allocation to each buf element
     * RETURN VALUES: boolean - is possible to allocate
     */
    boolean checkDivs(int[] res, int[] buf, int resInd, int alloc) {
        // base case
        if (resInd >= res.length)
            return true;

        // Check if the selected resource is <= allocation:
        if (res[resInd] <= alloc) {
            for (int i = 0; i < buf.length; i++) {
                // Check if the selected resource + current buffer element <= allocation:
                if (buf[i] + res[resInd] <= alloc) {
                    // add next highest value to the first available element in your memory buffer
                    // of k elements. Go to #4.
                    buf[i] += res[resInd];
                    // move to next resource
                    resInd++;
                    break;
                }
            }

        } else {
            // If not, move on (return false) to allow recursion to go back, servicing the
            // recursive calls already in your memory buffer.
            // Note: if there's no available space to accommodate the selected resource, it
            // is impossible for resources to be allocated equally.
            return false;
        }
        return checkDivs(res, buf, resInd, alloc);

    }
}