import java.util.*;

public class HW8 {
    public static void main(String[] args) {

        // create a solution instance
        Solution sol = new Solution();

        // create a random binary tree of your choice
        BSTNode tree = new BSTNode(3); // 2
        tree.left = new BSTNode(0);
        tree.right = new BSTNode(0);

        BSTNode tree2 = new BSTNode(0); // 3
        tree2.left = new BSTNode(0);
        tree2.right = new BSTNode(3);

        BSTNode tree3 = new BSTNode(0); // 5
        tree3.left = new BSTNode(0);
        tree3.left.left = new BSTNode(1);
        tree3.right = new BSTNode(1);
        tree3.right.left = new BSTNode(1);
        tree3.right.right = new BSTNode(3);

        BSTNode tree4 = new BSTNode(0); // 13
        tree4.left = new BSTNode(0);
        tree4.left.left = new BSTNode(0);
        tree4.left.left.left = new BSTNode(0);
        tree4.right = new BSTNode(3);
        tree4.right.left = new BSTNode(3);
        tree4.right.right = new BSTNode(0);
        tree4.right.right.left = new BSTNode(2);
        tree4.right.right.right = new BSTNode(1);

        BSTNode tree5 = new BSTNode(9); // 17
        tree5.left = new BSTNode(0);
        tree5.left.left = new BSTNode(0);
        tree5.left.left.left = new BSTNode(0);
        tree5.right = new BSTNode(0);
        tree5.right.left = new BSTNode(0);
        tree5.right.right = new BSTNode(0);
        tree5.right.right.left = new BSTNode(0);
        tree5.right.right.right = new BSTNode(0);

        BSTNode tree6 = new BSTNode(0); // 10
        tree6.left = new BSTNode(0);
        tree6.left.left = new BSTNode(0);
        tree6.left.left.left = new BSTNode(0);
        tree6.left.left.left.left = new BSTNode(5);
        tree6.right = new BSTNode(1);

        // your solution method will be tested with
        // a random tree of your choice
        System.out.println(sol.distribute(tree)); // 2
        sol = new Solution();
        System.out.println(sol.distribute(tree2)); // 3
        sol = new Solution();
        System.out.println(sol.distribute(tree3)); // 5
        sol = new Solution();
        System.out.println(sol.distribute(tree4)); // 13
        sol = new Solution();
        System.out.println(sol.distribute(tree5)); // 17
        sol = new Solution();
        System.out.println(sol.distribute(tree6)); // 10
    }
}

// ===============================================
// DO NOT MODIFY TREE BELOW THIS LINE
// ===============================================
class BSTNode {
    int val;
    BSTNode left;
    BSTNode right;

    BSTNode(int x) {
        val = x;
    }
}
// ===============================================
// DO NOT MODIFY TREE ABOVE THIS LINE
// ===============================================

class Solution {

    // YOUR MAY ADD ANY GLOBAL VARIABLES,
    // HELPER METHODS, etc., in this class

    // track to the number of moves
    int moves = 0;

    // track tree level
    int level = 0;

    // /**
    // * PURPOSE: Distribute PPEs so each hospital (node) has 1
    // * PARAMETERS: root node
    // * RETURN VALUES: moves required to achieve even distribution
    // */

    public int distribute(BSTNode root) {
        // YOUR CODE HERE

        // base case
        if (root == null) {
            return 0;
        }

        // going up tree level
        level++;

        // recurse down left tree
        int left = distribute(root.left);

        // recurse down right tree
        int right = distribute(root.right);

        // calculate moves from both child nodes
        moves += Math.abs(left) + Math.abs(right);

        // going down tree level
        level--;

        // if level is 0 (root node), return moves
        if (level == 0) {
            return moves;
        } else {
            // return the total PPEs at this node
            return root.val + left + right - 1;
        }
    }
}
