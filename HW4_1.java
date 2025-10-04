import java.util.Arrays;

public class HW4_1 {
    public static void main(String[] args) {
        // your solution will be tested as such, sequentially with random input
        Solution sol = new Solution();
        sol.canDistribute(new int[] { 1 }, 2);
        sol.canDistribute(new int[] { 1, 2, 2, 3, 3, 5, 5 }, 12);
        sol.canDistribute(new int[] { 3, 4, 5, 6 }, 2); // true
        sol.canDistribute(new int[] { 1 }, 1); // true
        sol.canDistribute(new int[] { 1, 3, 2, 3, 4, 1, 3, 5, 2, 1 }, 5); // true
        sol.canDistribute(new int[] { 1 }, 4); // false
        // etc.
    }
}

/**
 * PURPOSE: Proportion and distribute resources equally to 'k' medical
 * facilities
 * PARAMETERS: resources - positive integer array, groups - 'k' number of
 * facilities
 * RETURN VALUES:
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

        // int allocation = 0;
        // for (int r : resources) {
        // allocation += r;
        // }

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

        // cannot evenly distribute resource larger than average
        if (resources[0] > allocation)
            return false;

        // Create another solution method of your choice to enable recursion.
        int[] divisions = new int[groups];
        int resIndex = 0;
        return canPartition(resources, divisions, resIndex, allocation);
    }

    private boolean canPartition(int[] resources, int[] partitions, int resourceIndex, int k) {
        if (resourceIndex >= resources.length)
            return true;

        int currentResource = resources[resourceIndex];

        for (int i = 0; i < k - 1; i++) {

        }
        return true;

        // Remaining Pseudo Code:

        // Create an empty array of integers with k elements. This is your "memory
        // buffer". At the end of your recursion, you want this memory buffer be filled
        // with equally allocated values, allocation.
        // int[] buf = new int[grps];
        // int bufPlace = 0;
        // int resStart = 0;
        // int resEnd = subRes.length - 1;

        // Pick the highest resource (one with the highest integral value) in your
        // resources.
        // 3. Check if the selected resource is <= allocation:
        // if (subRes[resEnd] == allocation) {
        // If yes, add that value to the first available element in your memory buffer
        // of k elements. Go to #4.
        // buf[0] = subRes[resEnd];
        // bufPlace++;
        // resEnd--;
        // } else if (subRes[resEnd] < allocation) {
        // if (subRes[0] + subRes[resEnd] == allocation) {
        // buf[0] = subRes[0] + subRes[resEnd];
        // }
        // } else {
        // If not, move on (return false) to allow recursion to go back, servicing the
        // recursive calls already in your memory buffer.
        // return buf;
        // Note: if there's no available space to accommodate the selected resource, it
        // is impossible for resources to be allocated equally.
    }
    // 4. Advance to the next highest resource. Repeat Step #3. If all resources
    // have
    // been considered and there is no more next highest, go to Step #5.
    // System.arraycopy(resCheck(Arrays.copyOfRange(subRes, 1, resEnd), grps,
    // allocation), 0, buf, 1, resEnd);

    // 5. Check if every element in your memory buffer has the same value. If so you
    // have an evenly allocated distribution - return true. False otherwise.

}
