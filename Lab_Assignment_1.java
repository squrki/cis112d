
/**
 * PURPOSE:
 * PARAMETERS:
 * RETURN VALUES:
 */

/**
 * PURPOSE: displays when the cursor lingers over the component. If the text is
 * null, the tool tip is turned off for this component.
 * PARAMETERS:
 * str1, the string to display.
 * str2, the string to carry over to next iterative function, nextFunc()
 * RETURN VALUES:
 * The combined string after cursor is done moving
 */
import java.util.Arrays;

public class Lab_Assignment_1 {
    public static void main(String[] args) {
        // Your main() is not graded so you can
        // have any implementation in this area, e.g.,

        Solution obj = new Solution();

        // int[] temperatures = new int[];

        int[] answer = obj.getIndices(new int[] { 1, 2, 3, 4, 5 }, 9);

        System.out.println(Arrays.toString(answer));

        answer = obj.getIndices(new int[] { 1, 7, 18, 22 }, 8);

        System.out.println(Arrays.toString(answer));
    }
}

class Solution {
    public int[] getIndices(int[] nums, int target) {
        // int[] ans = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] { -1, -1 };
    }
}
