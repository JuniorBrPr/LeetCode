import java.util.ArrayList;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
 TreeNode() {}
     TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> r1 = new ArrayList<>();
        ArrayList<Integer> r2 = new ArrayList<>();
        leafs(root1, r1);
        leafs(root2, r2);
        return r1.equals(r2);
    }

    private void leafs(TreeNode root, ArrayList<Integer> arrayList) {
        if (root == null) return;
        if (root.left == null && root.right == null) arrayList.add(root.val);
        leafs(root.left, arrayList);
        leafs(root.right, arrayList);
    }
}

