public class HW6 {
   public static void main(String[] args) {
      // your solution method will be tested as such, with random sequential input
      // TEST CASE #1: instantiate a queue of capacity = 1
      Solution sol = new Solution(1);
      sol.getFront(); // -1
      sol.getRear(); // -1
      sol.add(8);
      sol.getFront(); // 0
      sol.getRear(); // 0
      sol.peek(); // 8
      sol.remove(); // 8
      sol.isEmpty(); // true
      sol.getFront(); // -1, when queue is empty
      sol.getRear(); // -1, when queue is empty

      // TEST CASE #2: instantiate a queue of capacity = 3
      Solution sol2 = new Solution(3);
      sol2.add(1);
      sol2.add(2);
      sol2.add(3);
      sol2.getFront(); // 0
      sol2.getRear(); // 2
      sol2.remove(); // 1
      sol2.getFront(); // 1
      sol2.getRear(); // 2
      // etc
   }
}

class Solution {
   // Dynamic array size
   private int capacity;
   // Queue
   private int[] elements;
   // Dynamic queue size
   private int numElements = 0;
   // Dynamic index for the front of queue, defaulting to -1 when the queue is
   // empty
   private int front = -1;
   // Dynamic index for the rear of queue, defaulting to -1 when the queue is empty
   private int rear = -1;

   // Constructor
   public Solution(int capacity) {
      this.capacity = capacity;
      this.elements = new int[this.capacity];
   }

   // Get the front index
   public int getFront() {
      return this.front;
   }

   // Get the rear index
   public int getRear() {
      return this.rear;
   }

   /*
    * =====================================
    * /* !!! DO NOT MODIFY ABOVE THIS LINE !!!
    * /* =====================================
    * 
    * 
    * /**
    * PURPOSE:
    * PARAMETERS:
    * RETURN VALUES:
    */
   public void add(int x) {
      // YOUR CODE HERE
   }

   /**
    * PURPOSE:
    * PARAMETERS:
    * RETURN VALUES:
    */
   public int remove() {
      // YOUR CODE HERE
      return -1
   }

   /**
    * PURPOSE:
    * PARAMETERS:
    * RETURN VALUES:
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
}
