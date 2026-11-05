class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int leftd =maxDepth(root.left);
        int rightd=maxDepth(root.right);

        return 1+ Math.max(leftd,rightd);
    }
}
