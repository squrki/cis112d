public class Lab3 {
   public static void main(String[] args) {
      // just like any problems, whatever you need here, etc.
      NodeLab3 node = new NodeLab3(1);
      node.next = new NodeLab3(2);
      node.next.next = new NodeLab3(3);
      node.next.next.next = new NodeLab3(4);
      node.next.next.next.next = new NodeLab3(5);
      node.next.next.next.next.next = null;
      SolutionLab3 sol = new SolutionLab3();
      node = sol.reverseList(node);
      sol.printList(node);
   }
}

class NodeLab3 {
   int val;
   NodeLab3 next;

   NodeLab3(int x) {
      val = x;
   }
}

class SolutionLab3 {
   public NodeLab3 reverseList(NodeLab3 n) {
      // YOUR CODE HERE
      NodeLab3 prev = null;
      NodeLab3 current = n;
      NodeLab3 next = null;
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

   public void printList(NodeLab3 head) {
      // YOUR CODE HERE. NOTE THE NEW "HEAD"
      // WILL REMAIN POINTING TO THE SAME REFERENCE
      // NODE AS WHEN IT WAS PASSED IN.
      NodeLab3 currNode = head;
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
