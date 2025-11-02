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
    }
}

class MyIterator implements Iterator<Integer> {

    // ==============================================
    // ANY GLOBAL VARIABLE DECLARATIONS HERE
    // ==============================================

    public MyIterator(Iterator<Integer> iterator) {
        // ==============================================
        // YOUR INITIALIZATIONS HERE
        // ==============================================
    }

    /**
     * PURPOSE:
     * PARAMETERS:
     * RETURN VALUES:
     */
    public Integer lookAhead() {
        // ==============================================
        // YOUR CODE HERE
        // ==============================================
    }

    /**
     * PURPOSE:
     * PARAMETERS:
     * RETURN VALUES:
     */
    @Override
    public Integer next() {
        // ==============================================
        // YOUR CODE HERE
        // ==============================================
    }

    /**
     * PURPOSE:
     * PARAMETERS:
     * RETURN VALUES:
     */
    @Override
    public boolean hasNext() {
        // ==============================================
        // YOUR CODE HERE
        // ==============================================
    }
}
