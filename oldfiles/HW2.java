import java.util.Stack;

public class HW2 {
   public static void main(String[] args) {

      Solution s = new Solution();
      System.out.println(s.isSameEventSequence(new int[] { 2, 1, 3 }, new int[] { 3, 2, 1 }));
      System.out.println(s.isSameEventSequence(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }));
      System.out.println(s.isSameEventSequence(new int[] { 1 }, new int[] { 1 }));
      System.out.println(s.isSameEventSequence(new int[] { 6, 5, 4, 3, 2, 1 }, new int[] { 1, 3, 2, 4, 5, 6 }));
      System.out.println(s.isSameEventSequence(new int[] { 6, 5, 4, 3, 2, 1 }, new int[] { 1, 2, 3, 4, 5, 6 }));
   }
}

/**
 * PURPOSE: Determine whether the sequences of events pushed and events popped
 * is possible
 * PARAMETERS:
 * int array events_pushed
 * int array events_popped
 * RETURN VALUES:
 * boolean if the two sequences are possible
 */
class Solution {
   public boolean isSameEventSequence(int[] events_pushed, int[] events_popped) {

      // instantiate stack, flag, and indices
      Stack<Integer> events = new Stack<>();
      boolean donePushing = false;
      boolean valid = true;
      int pushed = 0;
      int popped = 0;

      // iterate through events
      while (valid) {

         // push events to stack until end of array
         if (pushed < events_pushed.length) {
            events.push(events_pushed[pushed]);
            pushed++;
         } else {
            // flag that pushing is completed
            donePushing = true;
         }

         // check if pop is possible
         if (events.peek() == events_popped[popped]) {
            // go to next pop
            events.pop();
            popped++;
         } else if (donePushing) {
            // exit loop if cannot pop further
            valid = false;
         }

         // repeat pop check until end of both arrays reached
         if (popped == events_popped.length && pushed == events_pushed.length) {
            // both push and pop are depleted, so sequence is valid
            return valid;
         }
      }
      // sequence is invalid
      return valid;
   }
}