public class Lab4 {
    public static void main(String[] args) {

        // Using the example above, the intersection is "c1"

        // Constructing L1
        NodeLab4 l1 = new NodeLab4("a1");
        l1.next = new NodeLab4("a2");
        l1.next.next = new NodeLab4("a3");

        // Constructing the intersected/common nodes.
        NodeLab4 c1 = new NodeLab4("c1");
        NodeLab4 c2 = new NodeLab4("c2");
        NodeLab4 c3 = new NodeLab4("c3");

        l1.next.next.next = c1;
        l1.next.next.next.next = c2;
        l1.next.next.next.next.next = c3;

        // Constructing L2
        NodeLab4 l2 = new NodeLab4("b1");
        l2.next = new NodeLab4("b2");
        l2.next.next = c1;
        l2.next.next.next = c2;
        l2.next.next.next.next = c3;

        // Invoke solution method to solve
        SolutionLab4 sol = new SolutionLab4();
        System.out.println(sol.getIntersection(l1, l2).val); // this should print "c1"
    }
}

class NodeLab4 {
    String val;
    NodeLab4 next;

    NodeLab4(String x) {
        val = x;
    }
}

class SolutionLab4 {
    public NodeLab4 getIntersection(NodeLab4 L1, NodeLab4 L2) {
        if (L1 == L2) {
            return L1;
        }
        NodeLab4 line2 = L2.next;
        while (L1 != line2) {
            while (L1 != line2) {
                line2 = line2.next;
                if (line2 == null)
                    break;
            }
            if (L1 != line2) {
                L1 = L1.next;
                // if (L1 == null)
                // break;
                line2 = L2.next;
            }
        }
        return L1;
    }
}