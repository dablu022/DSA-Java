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
// class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
        
//     }
// }

class Solution {
    class pair{
        TreeNode node;
        int level;
        pair( TreeNode node,int value){
            this.node=node;
            this.level=value;
        }  
    }
     public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        List<Integer> a= new ArrayList<>();

       return  bfs(root,ans,a);
    }
     public List<Integer> bfs(TreeNode root, List<Integer> ans, List<Integer> a){
        if(root==null) return ans;
         int curr=0;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root,0));

        while(q.size()>0){
            pair front=q.remove();
            TreeNode node = front.node;
            int level= front.level; 

            if(curr!=level){
           curr++;
             ans.add( a.getLast());
              a.clear();
            }
            
           a.add(node.val);
            if(node.left!=null) q.add(new pair(node.left,level+1));  
            if(node.right!=null) q.add(new pair(node.right,level+1));
        }
       ans.add(a.getLast());
        return ans;
     }
     }
