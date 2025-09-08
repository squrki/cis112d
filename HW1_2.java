
/**
 * PURPOSE:
 * PARAMETERS:
 * RETURN VALUES:
 */

/**
 * PURPOSE: displays when the cursor lingers over the component. If the text is null, the tool tip is turned off for this component.
 * PARAMETERS:
 *     str1, the string to display.
 *     str2, the string to carry over to next iterative function, nextFunc()
 * RETURN VALUES:
 *     The combined string after cursor is done moving
*/

import java.util.Stack;

public class HW1_2 {
   public static void main(String[] args) {
      // Your main() is not graded so you can
      // have any implementation in this area, e.g.,
      MinStack minStack = new MinStack();

      minStack.push(-2);

      minStack.push(0);

      minStack.push(-3);

      System.out.println(minStack.getMin()); // returns -3

      minStack.pop();

      System.out.println(minStack.top()); // returns 0

      System.out.println(minStack.getMin()); // returns -2
   }
}

/**
 * The MaxStack program implements a Stack class with the following features:
 * push(x) -- push integer element x onto stack. This method returns void.
 * pop() -- remove the element on top of the stack. This method returns void.
 * top() -- get the top integer element.
 * getMax() -- retrieve the integer max element in the stack in constant time
 * O(1)
 */
class MinStack {
   // Initialize your data structure in constructor
   // or here; choice is yours.

   Stack<Integer> stack = new Stack<>();
   int min;

   public MinStack() {
   }

   public void push(int x) {
      this.stack.push(x);
      if (x < this.min) {
         this.min = x;
      }
   }

   public void pop() {
      this.stack.pop();
   }

   public int top() { // YOUR CODE HERE
      return this.stack.peek();
   }

   public int getMin() {
      return this.min;
   }
}
