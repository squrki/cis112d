import java.util.*;

public class HW9 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Your solution method will be tested with random input
        // such as the following; the actual test cases will be
        // different
        sol.put("app", 100);
        sol.getSum("ap"); // returns 100 as "ap" is a prefix to "app"
        sol.put("ap", 1);
        sol.getSum("a"); // returns 101 as "a" is a prefix to both keys in map
        sol.getSum("xyz"); // returns 0 as "xyz" is not a prefix to any keys in map
        sol.put("app", 8); // replaces the value of the existing key "app" from 100 to 8
        sol.getSum("ap"); // returns 9 as "ap" is a prefix to both keys in map
    }
}

class Solution {

    // You may add any global variables here

    // define hash map
    HashMap<String, Integer> map = new HashMap<String, Integer>();;

    public Solution() {
        // YOUR CODE HERE, IF NEEDED
    }

    /**
     * PURPOSE: adds key/value pairs to the hash map
     * PARAMETERS: String key, int value
     * RETURN VALUES: none
     */
    public void put(String key, int value) {
        // YOUR CODE HERE
        // add item to hash map
        map.put(key, value);
    }

    /**
     * PURPOSE: returns sum of all values with keys that start with prefix
     * PARAMETERS: prefix String
     * RETURN VALUES: sum of all values that start with key prefix
     */
    public int getSum(String key) {
        // YOUR CODE HERE

        // make hash key iterator
        int sum = 0;
        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();

        // if key contains prefix, add to sum
        while (iter.hasNext()) {
            String currKey = iter.next();

            if (currKey.startsWith(key)) {
                sum += map.get(currKey).intValue();
            }
        }
        return sum;
    }
}
