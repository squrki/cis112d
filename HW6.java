import java.util.Arrays;

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
      System.out.printf("front: %d\n", this.front); // delete
      return this.front;
   }

   // Get the rear index
   public int getRear() {
      System.out.printf("rear: %d\n", this.rear); // delete
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
      // YOUR CODE HERE
      if (this.front == -1 && this.rear == -1) {
         this.front = 0;
         this.rear = 0;
      } else {
         if (this.rear + 1 == this.capacity) {
            this.rear = 0;
         } else {
            this.rear++;
         }
      }
      this.elements[this.rear] = x;
      this.numElements++;
      System.out.printf("adding: %d | %s\n", x, Arrays.toString(this.elements));
   }

   /**
    * PURPOSE: remove first element in queue
    * PARAMETERS: none
    * RETURN VALUES: first element integer value
    */
   public int remove() {
      int num = this.elements[this.front];
      this.elements[this.front] = 0;
      if (this.front + 1 == this.capacity) {
         this.front = 0;
      } else {
         this.front++;
      }
      this.numElements--;
      if (this.numElements == 0) {
         this.front = -1;
         this.rear = -1;
      }
      System.out.printf("removing: %d\n", num);
      return num;
   }

   /**
    * PURPOSE: see first element integer in queue
    * PARAMETERS: none
    * RETURN VALUES: integer value of first element
    */
   public int peek() {
      System.out.printf("peeking: %d\n", this.elements[this.front]);
      return this.elements[this.front];
   }

   /**
    * PURPOSE: check if queue is empty
    * PARAMETERS: none
    * RETURN VALUES: boolean value checking if numElements == 0;
    */
   public boolean isEmpty() {
      System.out.printf("is Empty?: %s\n", this.numElements == 0);
      return this.numElements == 0;
   }
}
