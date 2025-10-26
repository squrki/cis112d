public class Lab2 {
    public static void main(String[] args) {
        NodeLab2 node = new NodeLab2(1);
        node.next = new NodeLab2(2);
        node.next.next = new NodeLab2(3);
        node.next.next.next = new NodeLab2(4);
        node.next.next.next.next = new NodeLab2(5);
        node.next.next.next.next.next = null;
        SolutionLab2 sol = new SolutionLab2();
        sol.printList(node);
    }
}

class NodeLab2 {
    int val;
    NodeLab2 next;

    NodeLab2(int x) {
        val = x;
    }
}

class SolutionLab2 {
    public void printList(NodeLab2 head) {
        // YOUR CODE HERE. NOTE THE NEW "HEAD"
        // WILL REMAIN POINTING TO THE SAME REFERENCE
        // NODE AS WHEN IT WAS PASSED IN.
        NodeLab2 currNode = head;
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