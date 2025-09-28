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

public class HW3 {
    public static void main(String[] args) {
        // your solution method may be tested as such, with a random linked list input
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = null;
        Solution sol = new Solution();
        sol.mixList(node); // list becomes homogeneous after this call. See below hint. 
        // you may use printList(node) to print out the list content after mixing.
        printList(node);
    }
    public static void printList(Node head) {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.println(node.val + "->null");
    }
}
class Node {
    int val;
    Node next;
    Node(int x) {
        val = x;
    }
}

/**
 * PURPOSE: 
 * PARAMETERS: 
 * RETURN VALUES:
 */
class Solution {
    public void mixList(Node head) {
        // YOUR CODE HERE
    }
}
