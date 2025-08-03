public class CountUnivalSubtrees {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            left = right = null;
        }

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private int count = 0;

    public int countUnivalSubtrees(Node root) {
        isUnival(root);
        return count;
    }

    private boolean isUnival(Node node) {
        if (node == null) return true;

        boolean left = isUnival(node.left);
        boolean right = isUnival(node.right);

        if (!left || !right) return false;

        if (node.left != null && node.left.val != node.val) return false;

        if (node.right != null && node.right.val != node.val) return false;

        count++;
        return true;
    }

    // Example usage
    public static void main(String[] args) {
        /*
              0
             / \
            1   0
               / \
              1   0
             / \
            1   1
         */

        Node root = new Node(0,
                new Node(1),
                new Node(0,
                        new Node(1, new Node(1), new Node(1)),
                        new Node(0)));

        CountUnivalSubtrees solution = new CountUnivalSubtrees();
        System.out.println(solution.countUnivalSubtrees(root));  // Output: 5
    }
}
