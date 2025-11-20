import java.util.*;

public class HW10 {
    public static void main(String[] args) {

        Solution10 sol = new Solution10();

        // Your solution methods will be tested with random input; the following is just
        // an example. The actual test cases will be different.
        int[] output = sol.getN(new int[] { 1, 2, 3, 4, 5, 6 }, 3);

        // You may use this approach to print your output to console to validate
        System.out.println(Arrays.toString(output)); // combination of any 3 input integers
                                                     // [2,3,6], [1,2,3], [4,5,6], etc.

        // If you wish to repeat with a different test case, you may as follows:
        output = sol.getN(new int[] { 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 6 }, 3);
        System.out.println(Arrays.toString(output)); // [6,5,2] or them 3 in any order

        output = sol.getN(new int[] { 10, 20, 20, 30, 30, 30, 40, 40, 40, 40 }, 2);
        System.out.println(Arrays.toString(output)); // [10, 20] or them 3 in any order

        output = sol.getN(new int[] { 50, 50, 100, 200, 300, 300, 400, 400, 400 }, 3);
        System.out.println(Arrays.toString(output)); // [200, 100, 50] or them 3 in any order

        output = sol.getN(new int[] { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, Integer.MAX_VALUE }, 1);
        System.out.println(Arrays.toString(output)); // [4] or [Integer.MAX_VALUE]

        output = sol.getN(new int[] { -1, -2, -3, -4, -5 }, 5);
        System.out.println(Arrays.toString(output)); // [-1, -2, -3, -4, -5] (or any permutation)

        output = sol.getN(new int[] { 0, 0, -5, -5, 10, -10, 20, 20, 20 }, 3);
        System.out.println(Arrays.toString(output)); // [-10, 10, 0] or them 3 in any order
    }
}

class Solution10 {

    // YOU MAY ADD ANY ADDITIONAL METHODS, VARIABLES, ETC., HERE

    /**
     * PURPOSE:
     * PARAMETERS:
     * RETURN VALUES:
     */
    public int[] getN(int[] input, int N) {
        // YOUR CODE HERE
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : input) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i) + 1);
            } else {
                freq.put(i, 1);
            }
        }
        int[] resultArray = new int[N];
        for (int i = 0; i < resultArray.length; i++) {
            int lowest = Collections.min(freq.values());
            int toRemove = -1;
            for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
                if (e.getValue() != lowest)
                    continue;
                else {
                    resultArray[i] = e.getKey();
                    toRemove = e.getKey();
                    break;
                }
            }
            freq.remove(toRemove);
        }
        return resultArray;
    }
}
