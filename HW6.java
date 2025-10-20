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
    * PURPOSE: adding element to queue
    * PARAMETERS: integer to identify element
    * RETURN VALUES: none
    */
   public void add(int x) {
      // Check if elements is empty
      // If yes, set front and rear to 0
      if (this.numElements == 0) {
         this.front = 0;
         this.rear = 0;
      } else {
         // If no, check if rear is last element in array
         if (this.rear + 1 == this.capacity) {
            // If yes, set rear to 0
            this.rear = 0;
         } else {
            // If no, increment rear
            this.rear++;
         }
      }
      // Increment numElements and assign value to queue
      this.numElements++;
      this.elements[this.rear] = x;
   }

   /**
    * PURPOSE: remove first element in queue
    * PARAMETERS: none
    * RETURN VALUES: first element integer value
    */
   public int remove() {
      // Get value of front element and reset front element
      int num = this.elements[this.front];
      this.elements[this.front] = 0;
      // Check if front is at rear of array.
      if (this.front + 1 == this.capacity) {
         // If yes, assign front to 0
         this.front = 0;
      } else {
         // If no, increment front
         this.front++;
      }
      // Decrement numElements
      this.numElements--;
      // Set front and rear to -1 if numElements is 0
      if (this.numElements == 0) {
         this.front = -1;
         this.rear = -1;
      }
      // return removed value
      return num;
   }

   /**
    * PURPOSE: see first element integer in queue
    * PARAMETERS: none
    * RETURN VALUES: integer value of first element
    */
   public int peek() {
      // Return value of front element in queue
      return this.elements[this.front];
   }

   /**
    * PURPOSE: check if queue is empty
    * PARAMETERS: none
    * RETURN VALUES: boolean value checking if numElements == 0;
    */
   public boolean isEmpty() {
      // Check if array is empty
      return this.numElements == 0;
   }
}
