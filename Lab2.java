public class Lab2 {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = null;
        Solution sol = new Solution();
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