public class Lab3 {
   public static void main(String[] args) {
      // just like any problems, whatever you need here, etc.
      Node node = new Node(1);
      node.next = new Node(2);
      node.next.next = new Node(3);
      node.next.next.next = new Node(4);
      node.next.next.next.next = new Node(5);
      node.next.next.next.next.next = null;
      Solution sol = new Solution();
      node = sol.reverseList(node);
      sol.printList(node);
   }
}

class Node {
   int val;
   Node next;

   Node(int x) {
      val = x;
   }
}

class Solution {
   public Node reverseList(Node n) {
      // YOUR CODE HERE
      Node prev = null;
      Node current = n;
      Node next = null;
      // read next node
      // place next node at head
      // head next is pointed to old head
      // continue
      //
      //
      //
      //
      //
      while (current != null) {
         next = current.next;
         current.next = prev;
         prev = current;
         current = next;
      }
      n = prev;
      return n;
   }

   public void printList(Node head) {
      // YOUR CODE HERE. NOTE THE NEW "HEAD"
      // WILL REMAIN POINTING TO THE SAME REFERENCE
      // NODE AS WHEN IT WAS PASSED IN.
      Node currNode = head;
      while (currNode != null) {
         System.out.print(currNode.val);
         currNode = currNode.next;
         if (currNode != null) {
            System.out.print("->");
         } else {
            System.out.println("->null");
         }
      }
   }
}
