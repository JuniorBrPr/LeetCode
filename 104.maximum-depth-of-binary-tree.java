class Solution {
    public int maxDepth(TreeNode root) {
        return max(root, 0);
    }

    private int max(TreeNode root, int depth){
        if (root == null){
            return depth;
        }
        return Integer.max(max(root.left, depth + 1), max(root.right, depth + 1));
    }
}

