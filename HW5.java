import java.util.Stack;

public class HW5 {
   public static void main(String[] args) {
      // your solution will be tested w/ random add()'s and remove()'s.
      // Observers like peek(), isEmpty() will be used along the way to validate.
      Solution sol = new Solution();
      sol.reverse(); // no effect since the queue is initially empty
      sol.add(8);
      sol.add(1);
      sol.peek(); // 8, if you use System.out.print() ** REMOVE
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
   // Stack<Integer> pushStack = new Stack<Integer>();
   // Stack<Integer> popStack = new Stack<Integer>();
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
      // while (!this.pushStack.empty()) {
      // this.popStack.push(this.pushStack.pop());
      // }
      // this.popStack.push(x);
      // while (!this.popStack.empty()) {
      // this.pushStack.push(this.popStack.pop());
      // }
      this.pushStack.push(x);
      System.out.println(this.pushStack);
      return;
   }

   /**
    * PURPOSE:
    * PARAMETERS:
    * RETURN VALUES: integer
    */
   public int remove() {
      // this.popStack.push(this.pushStack.pop());
      // return this.popStack.peek();
      System.out.println("removing: " + this.pushStack.peek());
      return this.pushStack.pop();
   }

   /**
    * PURPOSE:
    * PARAMETERS:
    * RETURN VALUES: integer
    */
   public int peek() {
      System.out.println("peeking: " + this.pushStack.peek());
      return this.pushStack.peek();
   }

   /**
    * PURPOSE:
    * PARAMETERS:
    * RETURN VALUES:
    */
   public boolean isEmpty() {
      System.out.println(this.pushStack.empty());
      return this.pushStack.empty();
   }

   /**
    * PURPOSE:
    * PARAMETERS:
    * RETURN VALUES:
    */
   public void reverse() {
      System.out.println("pushStack: " + this.pushStack);
      while (!this.pushStack.empty()) {
         this.popStack.push(this.pushStack.pop());
      }
      System.out.println("pushStack: " + this.pushStack + "  |  popStack: " + this.popStack);
      while (!this.popStack.empty()) {
         // this.pushStack.push(this.popStack.pop());
         System.out.println(this.popStack.lastElement());
         this.pushStack.push(this.popStack.lastElement());
         this.popStack.removeElementAt(this.popStack.size() - 1);
         System.out.println(this.popStack);
      }
      System.out.println("pushStack: " + this.pushStack + "  |  popStack: " + this.popStack);

   }

}