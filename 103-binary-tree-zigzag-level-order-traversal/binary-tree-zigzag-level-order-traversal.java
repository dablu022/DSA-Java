// class Solution {
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
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
   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> a= new ArrayList<>();

       return  bfs(root,ans,a);
    }
     public List<List<Integer>> bfs(TreeNode root, List<List<Integer>> ans, List<Integer> a){
        if(root==null) return ans;
         int curr=0;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root,0));

        while(q.size()>0){
            pair front=q.remove();
             
            TreeNode node = front.node;
            int level= front.level; 

            if(curr!=level){
                if(curr%2==1) Collections.reverse(a);
           curr++;
             ans.add(new ArrayList<>(a));
              a.clear();
            }
            
           a.add(node.val);
            if(node.left!=null) q.add(new pair(node.left,level+1));  
            if(node.right!=null) q.add(new pair(node.right,level+1));
           
        }
         if(curr%2==1) Collections.reverse(a);
        ans.add(new ArrayList<>(a));
        return ans;
     }
     }