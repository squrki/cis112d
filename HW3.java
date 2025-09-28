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
        // if list is single node, return
        if (head.next == null) {
            return;
        }
        // mark current Node
        Node currentNode = head;
        Node finalNode = head.next;
        boolean firstIteration = true;

        // find last node and 2nd to last node

        while (currentNode.next != null) {
            Node secondLastNode = currentNode;
            Node lastNode = currentNode.next;
            while (lastNode.next != null) {
                secondLastNode = lastNode;
                lastNode = lastNode.next;
            }
            if (firstIteration) {
                finalNode = lastNode;
                firstIteration = false;
            }
            if (lastNode == finalNode) {
                break;
            }
            // assign node.next() to last node.next()
            lastNode.next = currentNode.next;

            // assign last node to node.next()
            currentNode.next = lastNode;

            // assign original node.next() to currentNode
            currentNode = lastNode.next;

            // make 2nd last node to last node and assign null to next
            secondLastNode.next = null;
        }

    }
}
