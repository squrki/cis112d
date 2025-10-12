import java.util.Stack;

public class HW5 {
   public static void main(String[] args) {
      // your solution will be tested w/ random add()'s and remove()'s.
      // Observers like peek(), isEmpty() will be used along the way to validate.
      Solution sol = new Solution();
      sol.reverse(); // no effect since the queue is initially empty
      sol.add(8);
      sol.add(1);
      sol.reverse(); // this reverses the order of elements 8->1 to 1->8 in queue
      sol.peek(); // 1, if you use System.out.print()
      sol.remove(); // 1
      sol.isEmpty(); // false
      sol.add(2);
      sol.add(3);
      sol.peek(); // 8
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
    * PURPOSE: add item to queue
    * PARAMETERS: x: integer
    * RETURN VALUES: None
    */
   public void add(int x) {

      // move items to popStack
      while (!this.pushStack.empty()) {
         this.popStack.push(this.pushStack.pop());
      }

      // add item to top of popStack
      this.popStack.push(x);

      // move items to pushStack to maintain queue order
      while (!this.popStack.empty()) {
         this.pushStack.push(this.popStack.pop());
      }
      return;
   }

   /**
    * PURPOSE: remove item from queue
    * PARAMETERS: none
    * RETURN VALUES: integer value of removed item in queue
    */
   public int remove() {
      // removes first item of stack, which on pushStack is first item in queue
      return this.pushStack.pop();
   }

   /**
    * PURPOSE: see value of first item in queue
    * PARAMETERS: none
    * RETURN VALUES: integer value of first item in queue
    */
   public int peek() {
      // returns first item of stack, which on pushStack is first item in queue
      return this.pushStack.peek();
   }

   /**
    * PURPOSE: check is queue is empty
    * PARAMETERS: none
    * RETURN VALUES: boolean of whether queue is empty
    */
   public boolean isEmpty() {
      // checks whether queue (pushStack) is empty
      return this.pushStack.empty();
   }

   /**
    * PURPOSE: reverse the order of the queue
    * PARAMETERS: none
    * RETURN VALUES: none
    */
   public void reverse() {
      // move items from queue to popStack in reverse order
      while (!this.pushStack.empty()) {
         this.popStack.push(this.pushStack.elementAt(0));
         this.pushStack.removeElementAt(0);
      }

      // move items from popStack back to queue
      while (!this.popStack.empty()) {
         this.pushStack.push(this.popStack.pop());
      }

   }

}