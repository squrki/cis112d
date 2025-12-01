import java.util.*;

public class HW11 {
    public static void main(String[] args) {
        Solution11 sol = new Solution11();

        // Your solution may be tested with random input like this.
        // The actual test cases will vary.
        // ArrayList<List<String>> routes = new ArrayList<List<String>>();
        // routes.add(Arrays.asList("B", "C"));
        // routes.add(Arrays.asList("D", "B"));
        // routes.add(Arrays.asList("C", "A"));
        // System.out.println(sol.getDestination(routes) == "A");

        ArrayList<List<String>> routes = new ArrayList<List<String>>();
        routes.add(Arrays.asList("Z", "K"));
        routes.add(Arrays.asList("W", "X"));
        routes.add(Arrays.asList("K", "W"));
        routes.add(Arrays.asList("X", "Y"));
        routes.add(Arrays.asList("A", "W"));
        System.out.println(sol.getDestination(routes) == "Y");

        // ArrayList<List<String>> routes = new ArrayList<List<String>>();
        // routes.add(Arrays.asList("A", "B"));
        // System.out.println(sol.getDestination(routes) == "B");

        // ArrayList<List<String>> routes = new ArrayList<List<String>>();
        // System.out.println(sol.getDestination(routes) == null);

        // ArrayList<List<String>> routes = null;
        // System.out.println(sol.getDestination(routes) == null);

    }
}

/**
 * PURPOSE: Find the destination town in a list of routes.
 * PARAMETERS: List of routes as List<List<String>>
 * RETURN VALUES: Destination town as String
 */
class Solution11 {
    public String getDestination(List<List<String>> routes) {
        // YOUR CODE HERE

        // check for null or empty route list
        if (routes == null || routes.size() == 0)
            return null;

        // get all starting points
        ArrayList<String> startingPoint = new ArrayList<String>();

        for (List<String> route : routes) {
            startingPoint.add(route.get(0));
        }

        // check for ending point that is not in starting points
        for (List<String> route : routes) {
            String endingPoint = route.get(1);
            if (startingPoint.contains(endingPoint)) {
                continue;
            } else {
                return endingPoint;
            }
        }

        // default return to avoid IDE error
        return null;
    }
}
