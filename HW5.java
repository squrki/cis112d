import java.util.Stack;

public class HW5 {
   public static void main(String[] args) {
      // your solution will be tested w/ random add()'s and remove()'s.
      // Observers like peek(), isEmpty() will be used along the way to validate.
      Solution sol = new Solution();
      sol.reverse()  // no effect since the queue is initially empty
      sol.add(8); 
      sol.add(1); 
      sol.reverse()  // this reverses the order of elements 8->1 to 1->8 in queue
      sol.peek();    // 1, if you use System.out.print()
      sol.remove();  // 1
      sol.isEmpty(); // false
      sol.add(2); 
      sol.add(3); 
      sol.peek();    // 8
      // etc
   }
}

class Solution {
   // PLEASE USE THESE GLOBAL STACKS FOR THIS PROBLEM
   private Stack<Integer> pushStack = new Stack<Integer>();
   private Stack<Integer> popStack = new Stack<Integer>();
   /*
    * ====================================
    * !!! DO NOT MODIFY ABOVE THIS LINE !!!
    * ====================================
    */

   /**
    * PURPOSE:
    * PARAMETERS: x: integer
    * RETURN VALUES: None
    */
   public void add(int x) {
      // YOUR CODE HERE
   }

   /**
    * PURPOSE:
    * PARAMETERS:
    * RETURN VALUES: integer
    */
   public int remove() {
      // YOUR CODE HERE
   }

   /**
    * PURPOSE:
    * PARAMETERS:
    * RETURN VALUES: integer
    */
   public int peek() {
      // YOUR CODE HERE
   }

   /**
    * PURPOSE:
    * PARAMETERS:
    * RETURN VALUES:
    */
   public boolean isEmpty() {
      // YOUR CODE HERE
   }

   /**
    * PURPOSE:
    * PARAMETERS:
    * RETURN VALUES:
    */
   public void reverse() {
      // YOUR CODE HERE
   }

}