public class Midterm {

    public static void main(String[] args) {
        // just like any problems, whatever you need here, etc.
        Node node = new Node();
        node.next = new Node();
        node.next.next = new Node();
        node.next.next.next = new Node();
        node.next.next.next.next = null;
        LList sol = new LList();
        sol.size = 4;
        System.out.println(sol.removeHalf(sol));
    }
}

class Node {
    public Node next;
}

class LList {
    public int size;
    public Node head;

    public int removeHalf(LList myList) {
        int half = myList.size / 2;
        Node currentNode = myList.head;
        for (int i = 0; i < half / 2; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        return half;
    }
}