import java.util.*;

public class HW8 {
    public static void main(String[] args) {

        // create a solution instance
        Solution sol = new Solution();

        // create a random binary tree of your choice
        BSTNode tree = new BSTNode(3);
        tree.left = new BSTNode(0);
        tree.right = new BSTNode(0);

        // your solution method will be tested with
        // a random tree of your choice
        System.out.println(sol.distribute(tree)); // 2
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
    int assets = 0;
    int moves = 0;

    // /**
    //  * PURPOSE:
    //  * PARAMETERS:
    //  * RETURN VALUES:
    //  */
    // public int checkLeft(BSTNode node) {
    //     // YOUR CODE HERE
        
    //     if (node.left == null) {
    //         node.val += checkRight(node);
    //         if (node.right == null) {

    //         }
    //     }

    // }

    // /**
    //  * PURPOSE:
    //  * PARAMETERS:
    //  * RETURN VALUES:
    //  */
    // public int checkRight(BSTNode node) {
    //     // YOUR CODE HERE
    // }

    /**
     * PURPOSE:
     * PARAMETERS:
     * RETURN VALUES:
     */
    public int distribute(BSTNode root) {
        // YOUR CODE HERE
        if (root.val > 1) {
            while (root.val > 1) {
                assets++;
                root.val--;
            }
        } else if (root.val == 0) {
            root.val++;
            assets--;
            moves++;
        }

        if (root.left != null) {
            root.val += distribute(root.left);
        } else if (root.right != null) {
            root.val += distribute(root.right);
        }

        // get root node value
        // check left
        // if left is 0, move from root.
        // recurse down left and repeat
        return moves;
    }

}
