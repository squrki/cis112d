import java.util.*;

public class HW7_1 {
    public static void main(String[] args) {
        // Your solution will be tested as such, with random input lists such as the
        // following
        List<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3));
        MyIterator iter = new MyIterator(ints.iterator());
        System.out.println(iter.next()); // 1
        System.out.println(iter.lookAhead()); // 2
        System.out.println(iter.next()); // 2
        System.out.println(iter.next()); // 3
        System.out.println(iter.hasNext()); // false

        // TEST CASE #2
        // List<Integer> ints = new ArrayList<>(Arrays.asList(100));
        // MyIterator iter = new MyIterator(ints.iterator());
        // System.out.println(iter.next()); // 100
        // System.out.println(iter.lookAhead()); // null
        // System.out.println(iter.next()); // null
        // System.out.println(iter.hasNext()); // false

    }
}

class MyIterator implements Iterator<Integer> {

    // ==============================================
    // ANY GLOBAL VARIABLE DECLARATIONS HERE
    // ==============================================

    protected ArrayList<Integer> elements = new ArrayList<Integer>();
    protected int numElements = 0;
    protected int location = 0;

    public MyIterator(Iterator<Integer> iterator) {
        // ==============================================
        // YOUR INITIALIZATIONS HERE
        // ==============================================
        while (iterator.hasNext()) {
            numElements++;
            elements.add(iterator.next());
        }
    }

    /**
     * PURPOSE: equivalent function to peek() in a stack or queue.
     * PARAMETERS: None
     * RETURN VALUES: Integer
     */
    public Integer lookAhead() {
        // ==============================================
        // YOUR CODE HERE
        // ==============================================

        // if on the last element, return null
        // if (location >= numElements || location + 1 == numElements) {
        if (location == numElements) {
            return null;
        } else {
            return elements.get(location);
        }
    }

    /**
     * PURPOSE: Return next element of ArrayList
     * PARAMETERS: None
     * RETURN VALUES: Integer
     */
    @Override
    public Integer next() {
        // ==============================================
        // YOUR CODE HERE
        // ==============================================
        // }

        // return null if past last element
        if (location == numElements) {
            return null;
        } else {
            Integer nextNum = elements.get(location);
            location++;
            return nextNum;
        }
    }

    /**
     * PURPOSE: Check if there are elements remaining
     * PARAMETERS: none
     * RETURN VALUES: Boolean
     */
    @Override
    public boolean hasNext() {
        // ==============================================
        // YOUR CODE HERE
        // ==============================================

        if (location < numElements) {
            return true;
        }
        return false;
    }
}
