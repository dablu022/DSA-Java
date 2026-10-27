/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        String s ="";
       return bfs(root,ans,s);
    }
    public List<String> bfs( TreeNode root,List<String> ans,String s){
        if(root==null) return ans;
        if(root.left==null && root.right==null){
            s = s + root.val;
                ans.add(s);
        }
       s = s + root.val + "->";
        bfs(root.left,ans,s);
        bfs(root.right,ans,s);
        return ans;
    }
}