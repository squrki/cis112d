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
 * PURPOSE: Converts non-homogeneous linked list to a homogeneous linked list.
 * PARAMETERS: head, the head of the linked list to convert
 * RETURN VALUES: None.
 */

class Solution {
    public void mixList(Node head) {

        // if list is null or single node, return
        if (head == null || head.next == null) {
            return;
        }

        // mark current Node starting at head
        Node currentNode = head;

        while (currentNode.next != null && currentNode.next.next != null) {
            // find last node and 2nd to last node
            Node secondLastNode = currentNode;
            Node lastNode = currentNode.next;
            while (lastNode.next != null) {
                secondLastNode = secondLastNode.next;
                lastNode = lastNode.next;
            }

            // attach next node to end of last node
            lastNode.next = currentNode.next;

            // assign last node to currentNode.next()
            currentNode.next = lastNode;

            // assign original currentNode.next() to new currentNode
            currentNode = lastNode.next;

            // assign second last node to last node pointing to null
            secondLastNode.next = null;
        }
    }
}
