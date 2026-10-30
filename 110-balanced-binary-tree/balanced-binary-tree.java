class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int lft=level(root.left);
        int rgt=level(root.right);
        if(Math.abs(lft-rgt)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right) ;


    }public static int level(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
}