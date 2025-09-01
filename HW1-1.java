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
public class HW1_1 {    
    public static void main(String[] args) {
       // Your main() is not graded so you can
       // have any implementation in this area, e.g.,
       MaxStack obj = new MaxStack();
       obj.push(12);
       obj.push(1);
       obj.push(-12);
       obj.pop();
       System.out.println(obj.top());
       System.out.println(obj.getMax());
       // etc. 
   }
}
/**
* The MaxStack program implements a Stack class with the following features:
* push(x) -- push integer element x onto stack. This method returns void.
* pop() -- remove the element on top of the stack. This method returns void.
* top() -- get the top integer element.
* getMax() -- retrieve the integer max element in the stack in constant time O(1)
*/
class MaxStack {
   // Initialize your data structure in constructor 
   // or here; choice is yours.

   public MaxStack() { // YOUR CODE HERE starrt
   }

   public void push(int x) { // YOUR CODE HERE }
   public void pop() { // YOUR CODE HERE }
   public int top() { // YOUR CODE HERE }
   public int getMax() { // YOUR CODE HERE }
}