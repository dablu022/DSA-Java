class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> ans = new ArrayList<>();
        disp(root,ans);
        return ans;
    }
    public void disp(TreeNode root,    List<Integer> ans){
        if(root == null) return;
         ans.add(root.val);
         disp(root.left,ans);
          
            disp(root.right,ans);
          
      
    }
    }